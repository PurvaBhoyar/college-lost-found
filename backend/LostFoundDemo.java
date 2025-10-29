package backend;

import backend.factory.*;
import backend.decorator.*;
import backend.mediator.*;
import java.time.LocalDate;
import java.util.Scanner;

public class LostFoundDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║   COLLEGE LOST & FOUND MANAGEMENT SYSTEM          ║");
        System.out.println("╚═══════════════════════════════════════════════════╝\n");

        // ========== 1. FACTORY PATTERN ==========
        System.out.println("=== 1. FACTORY PATTERN - Create Lost Item ===\n");

        int choice = 0;
        while (true) {
            try {
                System.out.println("Select Item Type:");
                System.out.println("1. Electronics");
                System.out.println("2. Documents");
                System.out.println("3. Keys");
                System.out.println("4. Books");
                System.out.println("5. Accessories");
                System.out.print("Enter choice (1-5): ");
                choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= 5) break;
                else System.out.println("❌ Invalid choice! Please enter a number between 1 and 5.\n");
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.\n");
            }
        }

        String type;
        switch (choice) {
            case 1: type = "electronics"; break;
            case 2: type = "documents"; break;
            case 3: type = "keys"; break;
            case 4: type = "books"; break;
            case 5: type = "accessories"; break;
            default: type = "electronics";
        }

        System.out.print("Enter Item ID: ");
        String itemId = scanner.nextLine();

        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter Owner Name: ");
        String ownerName = scanner.nextLine();

        System.out.print("Enter Extra Info (brand/type/author): ");
        String extraInfo = scanner.nextLine();

        // Create item using Factory
        Item item = ItemFactory.createItem(type, itemId, itemName, ownerName, LocalDate.now(), extraInfo);

        System.out.println("\n✅ Item Created Successfully!");
        item.displayItemDetails();

        // ========== 2. DECORATOR PATTERN ==========
        System.out.println("\n\n=== 2. DECORATOR PATTERN - Add Features ===\n");

        boolean addUrgent = getYesNoInput(scanner, "Mark as URGENT? (y/n): ");
        boolean addReward = getYesNoInput(scanner, "Add reward offer? (y/n): ");
        double rewardAmount = 0;
        if (addReward) {
            while (true) {
                try {
                    System.out.print("Enter reward amount (₹): ");
                    rewardAmount = Double.parseDouble(scanner.nextLine().trim());
                    if (rewardAmount >= 0) break;
                    else System.out.println("❌ Reward amount cannot be negative.");
                } catch (NumberFormatException e) {
                    System.out.println("❌ Please enter a valid numeric value.");
                }
            }
        }

        boolean addLocation = getYesNoInput(scanner, "Add location tracking? (y/n): ");
        String location = "";
        if (addLocation) {
            System.out.print("Enter last known location: ");
            location = scanner.nextLine();
        }

        boolean addIDProof = getYesNoInput(scanner, "Require ID proof for claiming? (y/n): ");

        // Apply decorators based on user choices
        Item decoratedItem = item;
        if (addIDProof) decoratedItem = new IDProofRequired(decoratedItem);
        if (addLocation) decoratedItem = new LocationTracking(decoratedItem, location);
        if (addReward) decoratedItem = new RewardOffer(decoratedItem, rewardAmount);
        if (addUrgent) decoratedItem = new UrgentTag(decoratedItem);

        System.out.println("\n✅ Decorators Applied!");
        System.out.println("\nFinal Item with Features:");
        decoratedItem.displayItemDetails();

        // ========== 3. MEDIATOR PATTERN ==========
        System.out.println("\n\n=== 3. MEDIATOR PATTERN - Report Item ===\n");

        Mediator coordinator = new LostAndFoundCoordinator();

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        int roleChoice = 0;
        while (true) {
            try {
                System.out.println("\nAre you:");
                System.out.println("1. Owner (reporting lost item)");
                System.out.println("2. Finder (reporting found item)");
                System.out.print("Enter choice (1-2): ");
                roleChoice = Integer.parseInt(scanner.nextLine().trim());
                if (roleChoice == 1 || roleChoice == 2) break;
                else System.out.println("❌ Invalid choice! Please enter 1 or 2.");
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.");
            }
        }

        if (roleChoice == 1) {
            Owner owner = new Owner(coordinator, userName);
            System.out.println("\n--- Reporting Lost Item ---");
            owner.lostItem(decoratedItem);
        } else {
            Finder finder = new Finder(coordinator, userName);
            System.out.println("\n--- Reporting Found Item ---");
            finder.foundItem(decoratedItem);
        }

        // ========== SUMMARY ==========
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║            REGISTRATION SUCCESSFUL!               ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║    Item added to Lost & Found database            ║");
        System.out.println("║    Security features activated                    ║");
        System.out.println("║    Campus coordinator notified                    ║");
        System.out.println("║                                                   ║");
        System.out.println("║  Your item is now being tracked!                  ║");
        System.out.println("║  You will be contacted if there's a match.        ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");

        scanner.close();
    }

    // Helper for safe yes/no input
    private static boolean getYesNoInput(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("y")) return true;
            else if (input.equals("n")) return false;
            else System.out.println("❌ Please enter 'y' or 'n'.");
        }
    }
}

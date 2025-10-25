package backend.decorator;

import backend.factory.Item;
import backend.factory.ItemFactory;
import java.time.LocalDate;

public class DecoratorDemo {

    public static void main(String[] args) {
        System.out.println("=== Decorator Pattern Demo ===\n");

        // Create a base item using the factory
        Item baseItem = ItemFactory.createItem(
                "books",                     // type
                "B001",                      // itemId
                "Java Programming",          // itemName
                "Alice",                     // ownerName
                LocalDate.of(2025, 10, 20),  // dateLost
                "Blue cover, OOP concepts"   // extraType
        );

        System.out.println("Base Item Details:");
        baseItem.displayItemDetails();

        System.out.println("\n--- Applying Decorators ---");

        Item decoratedItem = new UrgentTag(
                new RewardOffer(
                        new LocationTracking(
                                new IDProofRequired(baseItem),
                                "Library - 2nd Floor"
                        ),
                        300.0
                )
        );

        System.out.println("\nDecorated Item Details:");
        decoratedItem.displayItemDetails();

        System.out.println("\n=== End of Decorator Demo ===");
    }
}

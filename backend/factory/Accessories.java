package backend.factory;

import java.time.LocalDate;

public class Accessories extends Item {
    private String accessoryType;

    public Accessories(String itemId, String itemName, String ownerName, LocalDate dateLost, String accessoryType) {
        super(itemId, itemName, ownerName, dateLost);
        this.accessoryType = accessoryType;
    }

    public String getAccessoryType() {
        return accessoryType;
    }

    public void setAccessoryType(String accessoryType) {
        this.accessoryType = accessoryType;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Accessories Item Details:");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Date Lost: " + dateLost);
        System.out.println("Accessory Type: " + accessoryType);
    }
}

// File: Electronics.java
package backend.factory;

import java.time.LocalDate;

public class Electronics extends Item {
    private String brand;

    public Electronics(String itemId, String itemName, String ownerName, LocalDate dateLost, String brand) {
        super(itemId, itemName, ownerName, dateLost);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Electronics Item Details:");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Date Lost: " + dateLost);
        System.out.println("Brand: " + brand);
    }
}

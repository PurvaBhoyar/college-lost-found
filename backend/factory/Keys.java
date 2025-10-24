// File: Keys.java
package backend.factory;

import java.time.LocalDate;

public class Keys extends Item {
    private String keyType;

    public Keys(String itemId, String itemName, String ownerName, LocalDate dateLost, String keyType) {
        super(itemId, itemName, ownerName, dateLost);
        this.keyType = keyType;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Keys Item Details:");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Date Lost: " + dateLost);
        System.out.println("Key Type: " + keyType);
    }
}

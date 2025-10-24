// File: Item.java
package backend.factory;

import java.time.LocalDate;

public abstract class Item {
    protected String itemId;
    protected String itemName;
    protected String ownerName;
    protected LocalDate dateLost;

    public Item(String itemId, String itemName, String ownerName, LocalDate dateLost) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.ownerName = ownerName;
        this.dateLost = dateLost;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public LocalDate getDateLost() {
        return dateLost;
    }

    public void setDateLost(LocalDate dateLost) {
        this.dateLost = dateLost;
    }

    public abstract void displayItemDetails();
}

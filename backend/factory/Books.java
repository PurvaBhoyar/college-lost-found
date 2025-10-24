package backend.factory;

import java.time.LocalDate;

public class Books extends Item {
    private String author;

    public Books(String itemId, String itemName, String ownerName, LocalDate dateLost, String author) {
        super(itemId, itemName, ownerName, dateLost);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Books Item Details:");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Date Lost: " + dateLost);
        System.out.println("Author: " + author);
    }
}

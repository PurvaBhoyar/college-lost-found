// File: FactoryPatternDemo.java
package backend.factory;

import java.time.LocalDate;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Create Electronics
        Item electronics = ItemFactory.createItem("Electronics", "E001", "Laptop", "Purva", LocalDate.now(), "Dell");
        electronics.displayItemDetails();
        System.out.println();

        // Create Documents
        Item documents = ItemFactory.createItem("Documents", "D001", "Assignment", "Purva", LocalDate.now(), "PDF");
        documents.displayItemDetails();
        System.out.println();

        // Create Keys
        Item keys = ItemFactory.createItem("Keys", "K001", "RoomKey", "Purva", LocalDate.now(), "Metal");
        keys.displayItemDetails();
        System.out.println();

        // Create Books
        Item books = ItemFactory.createItem("Books", "B001", "Data Structures", "Purva", LocalDate.now(), "John Doe");
        books.displayItemDetails();
        System.out.println();

        // Create Accessories
        Item accessories = ItemFactory.createItem("Accessories", "A001", "Watch", "Purva", LocalDate.now(), "Smartwatch");
        accessories.displayItemDetails();
    }
}

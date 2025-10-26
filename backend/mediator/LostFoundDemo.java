// File: backend/factory/LostFoundDemo.java
package backend.factory;

import java.time.LocalDate;

public class LostFoundDemo {
    public static void main(String[] args) {
        // Corrected call: provide type, itemId, itemName, ownerName, dateLost, extraType
        Item javaBook = ItemFactory.createItem(
                "Books",                          // type
                "B002",                           // itemId
                "Java Textbook",                  // itemName
                "Alice",                          // ownerName
                LocalDate.of(2025, 10, 20),       // dateLost
                "OOP concepts with examples"      // extraType (author/description)
        );

        javaBook.displayItemDetails();
    }
}

package backend.factory;

import java.time.LocalDate;

public class ItemFactory {

    /**
     * Creates an Item subclass based on type
     * @param type The type of item ("Electronics", "Documents", "Keys", "Books", "Accessories")
     * @param itemId Unique ID of the item
     * @param itemName Name/description of the item
     * @param ownerName Owner's name
     * @param dateLost Date when the item was lost
     * @param extraType Additional info specific to subclass (brand, documentType, keyType, author, accessoryType)
     * @return Item object of the correct subclass
     */
    public static Item createItem(String type, String itemId, String itemName, String ownerName, LocalDate dateLost, String extraType) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Electronics(itemId, itemName, ownerName, dateLost, extraType);
            case "documents":
                return new Documents(itemId, itemName, ownerName, dateLost, extraType);
            case "keys":
                return new Keys(itemId, itemName, ownerName, dateLost, extraType);
            case "books":
                return new Books(itemId, itemName, ownerName, dateLost, extraType);
            case "accessories":
                return new Accessories(itemId, itemName, ownerName, dateLost, extraType);
            default:
                throw new IllegalArgumentException("Unknown item type: " + type);
        }
    }
}

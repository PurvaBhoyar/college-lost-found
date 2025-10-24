// File: Documents.java
package backend.factory;

import java.time.LocalDate;

public class Documents extends Item {
    private String documentType;

    public Documents(String itemId, String itemName, String ownerName, LocalDate dateLost, String documentType) {
        super(itemId, itemName, ownerName, dateLost);
        this.documentType = documentType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Document Item Details:");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Date Lost: " + dateLost);
        System.out.println("Document Type: " + documentType);
    }
}

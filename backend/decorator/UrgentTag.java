package backend.decorator;

import backend.factory.Item;

public class UrgentTag extends ItemDecorator {

    public UrgentTag(Item item) {
        super(item);
    }

    @Override
    public void displayItemDetails() {
        item.displayItemDetails();
        System.out.println(" [Decorator] Marked as URGENT.");
    }
}

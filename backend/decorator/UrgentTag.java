package backend.decorator;

import backend.factory.Item;

public class UrgentTag extends ItemDecorator {

    public UrgentTag(Item item) {
        super(item);
    }

    @Override
    public void verify() {
        item.verify();
        System.out.println("[Decorator] This item is marked as URGENT! Handle immediately.");
    }
}

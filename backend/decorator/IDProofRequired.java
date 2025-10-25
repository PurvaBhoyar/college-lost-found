package backend.decorator;

import backend.factory.Item;

public class IDProofRequired extends ItemDecorator {

    public IDProofRequired(Item item) {
        super(item);
    }

    @Override
    public void displayItemDetails() {
        item.displayItemDetails();
        System.out.println(" [Decorator] ID proof required for verification.");
    }
}

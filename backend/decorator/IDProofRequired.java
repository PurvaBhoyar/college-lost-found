package decorator;

import factory.Item;

public class IDProofRequired extends ItemDecorator {

    public IDProofRequired(Item item) {
        super(item);
    }

    @Override
    public void verify() {
        item.verify();
        System.out.println("🪪 [Decorator] ID proof is required to claim this item.");
    }
}

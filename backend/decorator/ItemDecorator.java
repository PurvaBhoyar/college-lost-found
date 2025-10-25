package backend.decorator;

import backend.factory.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;   // The base item being decorated

    public ItemDecorator(Item item) {
        super(item.itemName, item.description);
        this.item = item;
    }

    @Override
    public abstract void verify();  // Each decorator adds its own extra verification
}

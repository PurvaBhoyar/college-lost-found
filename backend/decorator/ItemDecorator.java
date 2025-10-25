package backend.decorator;

import backend.factory.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;   // The base item being decorated

    public ItemDecorator(Item item) {
        super(item.getItemId(), item.getItemName(), item.getOwnerName(), item.getDateLost());
        this.item = item;
    }

    @Override
    public void displayItemDetails() {
        item.displayItemDetails();
    }
}

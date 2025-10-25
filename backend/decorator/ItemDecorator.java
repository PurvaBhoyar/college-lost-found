package backend.decorator;

import backend.factory.Item;
import java.time.LocalDate;

public abstract class ItemDecorator extends Item {
    protected Item item;   // The base item being decorated

    public ItemDecorator(Item item) {
        super(item.getItemId(), item.getItemName(), item.getOwnerName(), item.getDateLost());
        this.item = item;
    }
}

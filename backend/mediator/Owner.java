// File: backend/mediator/Owner.java
package backend.mediator;

import backend.factory.Item;

public class Owner extends User {
    public Owner(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void lostItem(Item item) {
        System.out.println(name + " reported lost item: " + item.getItemName());
        mediator.notify("Lost", "Item reported lost: " + item.getItemName());
    }
}

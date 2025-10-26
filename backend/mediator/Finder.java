// File: backend/mediator/Finder.java
package backend.mediator;

import backend.factory.Item;

public class Finder extends User {
    public Finder(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void foundItem(Item item) {
        System.out.println(name + " found an item: " + item.getItemName());
        mediator.notify("Found", "Item reported: " + item.getItemName());
    }
}

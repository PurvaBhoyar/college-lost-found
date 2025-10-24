package mediator;

public class Finder extends User {
    public Finder(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void foundItem(String itemName) {
        System.out.println(name + " found an item: " + itemName);
        mediator.notify("Found", "Item reported: " + itemName);
    }
}

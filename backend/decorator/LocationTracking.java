package backend.decorator;

import backend.factory.Item;

public class LocationTracking extends ItemDecorator {
    private String lastLocation;

    public LocationTracking(Item item, String lastLocation) {
        super(item);
        this.lastLocation = lastLocation;
    }

    @Override
    public void displayItemDetails() {
        item.displayItemDetails();
        // Use getter instead of direct field access
        System.out.println(" [Decorator] " + item.getItemName() + " last seen at: " + lastLocation);
    }
}

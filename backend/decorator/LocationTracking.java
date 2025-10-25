package backend.decorator;

import backend.factory.Item;

public class LocationTracking extends ItemDecorator {
    private String lastLocation;

    public LocationTracking(Item item, String lastLocation) {
        super(item);
        this.lastLocation = lastLocation;
    }

    @Override
    public void verify() {
        item.verify();
        System.out.println(" [Decorator] Last seen at: " + lastLocation);
    }
}

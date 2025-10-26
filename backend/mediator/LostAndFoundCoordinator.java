package backend.mediator;
import backend.factory.Item;
public class LostAndFoundCoordinator implements Mediator {
    @Override
    public void notify(String message, String event) {
        System.out.println("[Coordinator] Event: " + event + " | Message: " + message);
    }
    private boolean matchItems(Item lost, Item found) {
        return lost.getItemName().equalsIgnoreCase(found.getItemName());
    }

}

package backend.mediator;

public class LostAndFoundCoordinator implements Mediator {
    @Override
    public void notify(String event, String message) {
        System.out.println("[Coordinator] Event: " + event + " | Message: " + message);
    }
    private boolean matchItems(Item lost, Item found) {
        return lost.getItemName().equalsIgnoreCase(found.getItemName());
    }

}

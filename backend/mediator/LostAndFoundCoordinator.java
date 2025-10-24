package mediator;

public class LostAndFoundCoordinator implements Mediator {
    @Override
    public void notify(String event, String message) {
        System.out.println("[Coordinator] Event: " + event + " | Message: " + message);
    }
}

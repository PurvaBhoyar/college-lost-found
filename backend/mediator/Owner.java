package backend.mediator;

public class Owner extends User {
    public Owner(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void claimItem(String itemName) {
        System.out.println(name + " is trying to claim item: " + itemName);
        mediator.notify("Claim", "Claim request for: " + itemName);
    }
}

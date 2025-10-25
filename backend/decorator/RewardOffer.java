package backend.decorator;

import backend.factory.Item;

public class RewardOffer extends ItemDecorator {
    private double rewardAmount;

    public RewardOffer(Item item, double rewardAmount) {
        super(item);
        this.rewardAmount = rewardAmount;
    }

    @Override
    public void displayItemDetails() {
        item.displayItemDetails();
        System.out.println(" [Decorator] Reward offered: $" + rewardAmount);
    }
}

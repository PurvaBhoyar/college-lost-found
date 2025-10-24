package decorator;

import factory.Item;

public class RewardOffer extends ItemDecorator {
    private double rewardAmount;

    public RewardOffer(Item item, double rewardAmount) {
        super(item);
        this.rewardAmount = rewardAmount;
    }

    @Override
    public void verify() {
        item.verify();
        System.out.println("💰 [Decorator] Reward Offered: ₹" + rewardAmount + " for returning this item.");
    }
}

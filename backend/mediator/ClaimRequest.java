// File: backend/mediator/ClaimRequest.java
package backend.mediator;

import backend.factory.Item;

public class ClaimRequest {
    private Item item;
    private User claimant;
    private String claimDate;
    private boolean verified;

    public ClaimRequest(Item item, User claimant, String claimDate, boolean verified) {
        this.item = item;
        this.claimant = claimant;
        this.claimDate = claimDate;
        this.verified = verified;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getClaimant() {
        return claimant;
    }

    public void setClaimant(User claimant) {
        this.claimant = claimant;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}

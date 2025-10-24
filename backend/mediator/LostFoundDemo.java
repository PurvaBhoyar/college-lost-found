package main;

import factory.*;
import decorator.*;
import mediator.*;

public class LostFoundDemo {
    public static void main(String[] args) {
        System.out.println("---- College Lost & Found Management System ----");

        // 1. Factory pattern - create item
        Item item = ItemFactory.createItem("book", "Java Textbook", "OOP concepts with examples");

        // 2. Decorator pattern - add urgent tag
        item = new UrgentTag(item);

        // 3. Mediator pattern - handle communication
        Mediator coordinator = new LostAndFoundCoordinator();
        Finder finder = new Finder(coordinator, "Riya");
        Owner owner = new Owner(coordinator, "Purva");

        finder.foundItem(item.getDetails());
        owner.claimItem("Java Textbook");

        // Final verification
        item.verify();
    }
}

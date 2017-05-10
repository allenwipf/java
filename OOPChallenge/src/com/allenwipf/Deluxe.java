package com.allenwipf;

/**
 * Created by Wipf on 5/10/17.
 */
public class Deluxe extends Burger {

    public Deluxe() {
        super("Deluxe", "Wheat", "Double Beef Patty");
        super.addChips();
        super.addSoda();
    }

    // Prevent ordering more items
    @Override
    public void addBacon() {
        System.out.println("Can't add additional item to Deluxe Burger");
    }

    @Override
    public void addPeanutButter() {
        System.out.println("Can't add additional item to Deluxe Burger");
    }

    @Override
    public void addEgg() {
        System.out.println("Can't add additional item to Deluxe Burger");
    }

    @Override
    public void addTomatoes() {
        System.out.println("Can't add additional item to Deluxe Burger");
    }

    @Override
    public void addPickles() {
        System.out.println("Can't add additional item to Deluxe Burger");
    }

    @Override
    public void addSoda() {
        System.out.println("Can't add additional item to Deluxe Burger");
    }

    @Override
    public void addChips() {
        System.out.println("Can't add additional item to Deluxe Burger");
    }
}

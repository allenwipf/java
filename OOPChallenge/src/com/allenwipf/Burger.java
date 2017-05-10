package com.allenwipf;

/**
 * Created by Wipf on 5/10/17.
 */
public class Burger {
    // Labels
    private String name;
    private String bread;
    private String meat;
    private double price;
    private int items;

    // Constructor
    public Burger(String name, String bread, String meat) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = 5.00;
        this.items = 0;
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public int getItems() {
        return items;
    }

    public String getName(){
        return name;
    }


    // Methods
    public void addBacon(){
        addItems(2.00);
    }

    public void addPeanutButter(){
        addItems(0.50);
    }

    public void addEgg(){
        addItems(1.00);

    }

    public void addTomatoes(){
        addItems(0);
    }

    public void addPickles(){
        addItems(0);
    }

    public void addSoda(){
        addItems(1);
    }

    public void addChips(){
        addItems(1.50);
    }

    public String addItems(double price){
        if (this.items <= 6) {
            this.items += 1;
            this.price += price;
            return "Item Added";
        } else {
            return "Can't add more then 6 items";
        }
    }

    public String orderSummary(){
        return "You ordered the " + this.name + " with " + this.items + " extra items. The total cost is $" +
                this.price + ".";
    }
}

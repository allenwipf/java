package com.allenwipf;

/**
 * Created by Wipf on 5/10/17.
 */
public class Vegan extends Burger {

    public Vegan() {
        super("Vegan", "Roll", "Vegan Patty");
    }

    public void addCheese(){
        this.addItems(1.00);
    }

    public void addOnions(){
        this.addItems(0);
    }

}

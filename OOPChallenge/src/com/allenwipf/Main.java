package com.allenwipf;

public class Main {

    public static void main(String[] args) {

        Vegan vegan = new Vegan();
        vegan.addCheese();
        vegan.addOnions();
        vegan.addBacon();
        vegan.addPeanutButter();
        System.out.println(vegan.orderSummary());

        Deluxe deluxe = new Deluxe();
        deluxe.addBacon();
        System.out.println(deluxe.orderSummary());
    }


}

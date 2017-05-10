package com.allenwipf;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullname = "Allen";
//        player.health = 20;
//        player.weapon = "Scar";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Allen", 50, "Scar");
        System.out.println("Initial health is " + player.getHealth());
    }
}

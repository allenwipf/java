package com.allenwipf;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Allen", 500);
        System.out.println("New Score is " + newScore);
        calculateScore();
        printCent();


    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unamed Player scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No Player scored 0 points!");
        return 0;
    }

    public static void printCent(){
        double totalCent = calcFeetAndInchesToCentimeters(1, 1);
        System.out.println(totalCent);
        totalCent = calcFeetAndInchesToCentimeters(13);
        System.out.println(totalCent);

    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches < 12){
            return(((feet  * 12) * 2.54) + (inches * 2.54));
        } else {
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches > 0){
            double calcFeet = ((int) inches / 12);
            double calcInches = ((int) inches % 12);
            return calcFeetAndInchesToCentimeters(calcFeet, calcInches);
        } else {
            return -1;
        }

    }
}

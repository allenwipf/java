package com.allenwipf;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        calculateScore(true, 10_000, 8, 200);


        printPostion("Lawson", getPosition(1500));
        printPostion("Lydia", getPosition(1000));
        printPostion("Allen", getPosition(400));
        printPostion("Baby", getPosition(500));

    }

    public static void printPostion (String name, int position){
        System.out.println(name + " managed to get into position " + position);
    }

    public static int getPosition(int score){
        if (score >= 1000){
            return 1;
        } else if (500 <= score && score < 1000){
            return 2;
        } else if (100 <= score && score < 500) {
            return 3;
        } else {
            return 4;
        }

    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    ;
}

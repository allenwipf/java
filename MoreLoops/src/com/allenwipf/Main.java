package com.allenwipf;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("\n");

        count = 1;
        while(true){
            if (count ==5){
              break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count ++;
        } while (count < 5);



        int number = 5;
        int found = 0;

        while (number <= 20) {

            if (isEven(number)) {
                System.out.println(number + " is an even number");
                found++;
                if (found == 5){
                    System.out.println("Found " + found + " even number!");
                    break;
                }
            }
            number ++;
        }

    }

    public static boolean isEven(int number){
        if (number%2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

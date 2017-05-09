package com.allenwipf;

public class Main {

    public static void main(String[] args) {
        double dollars = 10_000;
        for(int interest=2; interest<=8; interest++){
            System.out.println("$" + (int) dollars + " at " + interest +"% interest = $" + String.format("%.2f", calculateInterest(dollars, interest)));
        }
        System.out.println("**********************************");

        for(int interest=8; interest>=2; interest--){
            System.out.println("$" + (int) dollars + " at " + interest +"% interest = $" + String.format("%.2f", calculateInterest(dollars, interest)));
        }

        int primeCount = 0;
        for (int i= 10; i <= 100; i++){
            if (isPrime(i)){
                primeCount ++;
                System.out.println(i + " is a prime number!");
            }
            if (primeCount == 5){
                System.out.println("\b" + primeCount + " prime numbers found!");
                break;
            }


        }


    }


    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for(int i=2; i <= n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }
}



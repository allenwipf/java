package com.allenwipf;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortNumbers(myIntegers);

        System.out.println("\nThanks! Below are your numbers sorted.");

        printArray(sorted);
    }
    // gets the numbers from keyboard and puts into array
    public static int[] getIntegers(int numberOfInts){
        int[] myArray = new int[numberOfInts];
        System.out.println("Enter " + numberOfInts + " Integers in random order.\r");
        for (int i = 0; i < numberOfInts; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    // sorts an array of ints from lowest to highest. breaks if there is a 0
    public static int[] sortNumbers(int[] array){
        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++){
            int position = 0;

            for (int j = 0; j < array.length; j++){
                if ((array[i] >= array[j]) && (i != j)){
                    position++;
                }
            }
            while (sortedArray[position] == array[i]){
                position--;
            }
            sortedArray[position] = array[i];
        }
        return sortedArray;
    }
    // prints the sorted array
    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}

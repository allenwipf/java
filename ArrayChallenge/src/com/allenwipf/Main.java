package com.allenwipf;

public class Main {

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortNumbers(myIntegers);

        printArray(sorted);
    }

    public static int[] getIntegers(int numbers){
        int[] myArray = {4541,3,2,6,0,4};
        return myArray;
    }

    public static int[] sortNumbers(int[] array){
        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++){
            int position = 0;

            for (int j = 0; j < array.length; j++){
                if (array[i] > array[j]){
                    position++;
                }
            }
            sortedArray[position] = array[i];
        }
        return sortedArray;
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}

package com.allenwipf;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts myContacts = new Contacts();

    public static void main(String[] args) {

        // add some default numbers
        myContacts.storeNumber("(970)381-0053");
        myContacts.storeNumber("(303)123-4567");
        myContacts.storeNumber("(402)123-4567");

        int choice = 0;
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter Choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    addNumber();
                    break;
                case 1:
                    deleteNumber();
                    break;
                case 3:
                    modifyNumber();
                    break;
                case 4:
                    printNumbers();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void printNumbers(){
        myContacts.printContacts();
    }

    public static void addNumber(){
        System.out.println("Please enter a number to add\n");
        myContacts.storeNumber(scanner.nextLine());
    }

    public static void deleteNumber(){
        System.out.println("Enter number to delete\n");
        myContacts.deleteNumber(scanner.nextLine());
    }

    public static void modifyNumber(){
        System.out.println("Enter number to edit");
        String oldNumber = scanner.nextLine();
        if (myContacts.checkifExists(oldNumber)) {
            System.out.println("Enter the new number");
            String newNumber = scanner.nextLine();
            myContacts.modifyNumber(oldNumber, newNumber);
        }
    }
}

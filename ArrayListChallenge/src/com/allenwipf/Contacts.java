package com.allenwipf;

import java.util.ArrayList;

/**
 * Created by Wipf on 5/11/17.
 */
public class Contacts {
    private ArrayList<String> contactList = new ArrayList <String>();

    // methods modify, remove, get, add
    // stores a number
    public void storeNumber(String number){
        contactList.add(number);
    }

    // prints all contacts
    public void printContacts(){
        for (int i = 0; i < contactList.size(); i++){
            System.out.println(contactList.get(i) + " ");
        }
    }

    // modify a number
    public void modifyNumber(String oldNumber, String newNumber){
        contactList.set(findIndex(oldNumber), newNumber);
        System.out.println(oldNumber + " has been changed to " + newNumber);
    }
    // remove a number
    public void deleteNumber(String number){
        contactList.remove(findIndex(number));
        System.out.println(number + " has been deleted.");
    }

    // checks if a number exists
    public boolean checkifExists(String number){
        if (findIndex(number) >= 0){
            return true;
        }
        System.out.println("Number doesn't exist.");
        return false;
    }

    // finds the index of a number
    private int findIndex(String number){
        int index = contactList.indexOf(number);
        return index;
    }
}

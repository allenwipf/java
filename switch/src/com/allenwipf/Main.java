package com.allenwipf;

public class Main {

    public static void main(String[] args) {

    char switchValue = 'A';
    switch(switchValue){

        case 'A':case 'B':case 'C':case 'D':case 'E':
            System.out.println("Value was " + switchValue);
            break;
        default:
            System.out.println("Was not 1 or 2");
            break;
    }
    String month = "March";
    switch(month.toLowerCase()) {
        case "january":case "febuary":case "march":
            System.out.println("The month is " + month);
            break;
        default:
            System.out.println("No Month");
    }

    }

}

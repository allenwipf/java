package com.allenwipf;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(new Toner(40), true);
        printer.printPage(5);

        Printer printer2 = new Printer(new Toner(20), false);
        printer2.printPage(5);

        printer.getToner().fillToner(20);
        System.out.println("Printer toner level is " + printer.getToner().getLevel() + "%.");
    }

}
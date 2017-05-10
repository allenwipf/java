package com.allenwipf;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(new Toner(40), 4, true);
        printer.printPage(5);
        printer.getToner().fillToner(20);
        printer.printPage(1);
        System.out.println(printer.isDuplex());
    }

}
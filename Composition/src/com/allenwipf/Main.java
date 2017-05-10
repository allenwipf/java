package com.allenwipf;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(15, 15, 2);
        Case  theCase = new Case("Pro", "Apple", "240", dimensions);

        Case  CaseThe = new Case("Pro", "Apple", "240",
                new Dimensions(15, 15, 2));

        Monitor theMonitor = new Monitor("Big One", "Apple",
                50, new Resolution(2540, 1400));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Apple",
                4, 6, "v10");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 1);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Master", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}

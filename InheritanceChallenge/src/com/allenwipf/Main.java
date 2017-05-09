package com.allenwipf;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Bus", "Large");

        System.out.println("The name of this vehicle is " + vehicle.getName() +
                " and the size is " + vehicle.getSize());

        vehicle.changeGears(5);
        vehicle.moving(67, "left");
        vehicle.steering("left");

        System.out.println("****************");

        Plane boeing = new Plane("767", "Very Large", 45_000, 50_000);

        boeing.steering("up");
        boeing.moving(1000, "up");
        boeing.getFullCap();
        vehicle.steering("up");

    }

}

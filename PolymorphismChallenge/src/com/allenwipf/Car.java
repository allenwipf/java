package com.allenwipf;

/**
 * Created by Wipf on 5/10/17.
 */
public class Car {
    private String name;
    private String engine;
    private double cylinders;
    private int wheels;
    private int doors;
    private int acceleration;

    public Car(String name, String engine, double cylinders, int wheels, int doors) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.doors = doors;
        this.acceleration = 0;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public String getName(){
        return name;
    }

    public void startCar(){
        System.out.println("Engine was started");
    }

    public void accelerate(int accelerate){
        System.out.println("Accelerating... " + this.name +
                " is now moving at " + (acceleration += accelerate) + " mph.");
    }

    public void brake(int brakeForce){
        System.out.println("Braking... " + this.name +
                " is now moving at " + (acceleration -= brakeForce) + " mph.");
    }

    public void stop(){
        acceleration = 0;
        System.out.println("Stopping..." + this.name +
                " is now moving at " + (acceleration) + " mph.");
    }
}

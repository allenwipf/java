package com.allenwipf;

/**
 * Created by Wipf on 5/10/17.
 */
public class Subaru extends Car{
    public Subaru(String engine, double cylinders,int doors) {
        super("Subaru", engine, cylinders, 4, doors);
    }

    @Override
    public void accelerate(int accelerate) {
        int speed = this.getAcceleration();
        System.out.println("Accelerating... " + this.getName() +
                " is now moving at " + (int) ((speed += accelerate) * .8) + " mph.");
    }
}

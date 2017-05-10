package com.allenwipf;

/**
 * Created by Wipf on 5/10/17.
 */
public class Mustang extends Car{
    public Mustang(int doors) {
        super("Mustang", "Gas", 4.7, 4, doors);
    }

    @Override
    public void accelerate(int accelerate) {
        int speed = this.getAcceleration();
        System.out.println("Accelerating... " + this.getName() +
                " is now moving at " + (int) ((speed += accelerate) * 1.4) + " mph.");
    }

}

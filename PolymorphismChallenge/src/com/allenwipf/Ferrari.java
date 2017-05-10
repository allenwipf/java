package com.allenwipf;

/**
 * Created by Wipf on 5/10/17.
 */
public class Ferrari extends Car{
    public Ferrari() {
        super("Ferrari", "Gas", 10, 4, 2);
    }

    @Override
    public void accelerate(int accelerate) {
        int speed = this.getAcceleration();
        System.out.println("Accelerating... " + this.getName() +
                " is now moving at " + ((speed += accelerate) * 2) + " mph.");
    }
}

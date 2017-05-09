package com.allenwipf;

/**
 * Created by Wipf on 5/9/17.
 */
public class Plane extends Vehicle{
    private int maxAlt;
    private int fullCap;

    public Plane(String name, String size, int maxAlt, int fulCap) {
        super(name, size);
        this.maxAlt = maxAlt;
        this.fullCap = fulCap;
    }

    public void getMaxAlt() {
        System.out.println("Plane can go " + maxAlt + " feet high.");
    }

    public void getFullCap() {
        System.out.println("Plane can carry " + fullCap + " liters of fuel.");
    }

    @Override
    public void steering(String direction) {
        if (direction.toLowerCase() == "forwards" || direction.toLowerCase() == "backwards"
                || direction.toLowerCase() == "up" || direction.toLowerCase() == "down") {
            System.out.println("Plane is going " + direction + ".");
        } else {
            System.out.println("Planes can't go " + direction);
        }
    }
}

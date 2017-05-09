package com.allenwipf;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by Wipf on 5/9/17.
 */
public class Vehicle {
    private String name;
    private String size;

    private int currentSpeed;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentSpeed = 2;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void steering(String direction){

        if (direction.toLowerCase() == "forward" || direction.toLowerCase() == "backwards") {
            System.out.println("Vehicle is stearing " + direction + ".");
        } else {
            System.out.println("Vehicles can't go " + direction + ".");
        }
    }

    public void changeGears(int gear){
        System.out.println("Vehicle is in gear " + gear + ".");
    }

    public void moving(int speed, String direction){
        System.out.println("Vehicle is moving " + (this.currentSpeed + speed) + " mph in direction " + direction);
    }

}

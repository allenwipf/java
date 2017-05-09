package com.allenwipf;

/**
 * Created by Wipf on 5/9/17.
 */
public class Car {

    public int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel == "carrera") {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}

package com.allenwipf;

public class Main extends Object{

    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelator(30);
        outlander.accelator(20);
        outlander.accelator(-42);
    }
}

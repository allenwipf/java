package com.allenwipf;

public class Main {

    public static void main(String[] args) {
        Mustang mustang = new Mustang(4);
        Ferrari ferrari = new Ferrari();
        Subaru subaru = new Subaru("diesel", 2.0, 2);


        mustang.accelerate(40);
        ferrari.accelerate(40);
        subaru.accelerate(40);

        System.out.println("\b");

        mustang.brake(10);
        mustang.stop();

    }

}

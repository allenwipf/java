package com.allenwipf;

/**
 * Created by Wipf on 5/9/17.
 */
public class Toner {
    private int level = 20;

    public Toner(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void fillToner(int tonerFill){
        if (tonerFill > 0){
            if ((this.level + tonerFill) > 100){
                this.level = 100;
            } else {
                this.level += tonerFill;
            }
        }
        System.out.println("Printer toner leve is " + this.level);
    }
}

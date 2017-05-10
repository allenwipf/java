package com.allenwipf;

/**
 * Created by Wipf on 5/9/17.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitors;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // draw logo
        monitor.drawPixelAt(1200,50, "Yellow");
    }

}

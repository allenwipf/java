package com.allenwipf;

/**
 * Created by Wipf on 5/9/17.
 */
public class Printer {
    private Toner toner;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(Toner toner, boolean duplex) {
        if (toner.getLevel() > 0 && toner.getLevel() < 100) {
            this.toner = toner;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void printPage(int pages){
        if (this.isDuplex()){
            pagesPrinted += Math.round((double) pages/2);
            System.out.println("It's a duplex");
        } else {
            pagesPrinted += pages;
            System.out.println("It's not a duplex");
        }
        System.out.println("Printer has printed a total of " + this.pagesPrinted + " pages.");
    }

    public Toner getToner() {
        return toner;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}

package com.allenwipf;

/**
 * Created by Wipf on 5/9/17.
 */
public class Printer {
    private Toner toner;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(Toner toner, int pagesPrinted, boolean duplex) {
        if (toner.getLevel() > 0 && toner.getLevel() < 100) {
            this.toner = toner;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void printPage(int pages){
        if (pages > 0){
            pagesPrinted += pages;
        }
        System.out.println("Printer has printed a total of " + this.pagesPrinted);
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

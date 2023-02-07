package com.codeclan.homework;

public class Printer {

    private int sheets;
    private int toner;

    public Printer (int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public void print(int pages, int copies) {
        int printJob = pages * copies;
        if (this.sheets >= printJob) {
            this.sheets -= printJob;
            this.toner -= printJob;
        }
    }
}

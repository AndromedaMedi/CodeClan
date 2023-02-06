package com.codeclan.homework;

public class Printer {

    private int sheets;

    public Printer (int sheets) {
        this.sheets = sheets;
    }

    public int print(int pages, int copies) {
        int printJob = pages * copies;
        if {
            this.sheets >= printJob;
            return String(printJob + " copies printing...");
        } else {
            return String("Load more paper!");
        }
    }
}

package com.xworkz.override21;

public class BedsheetStore {
    public void manage(Bedsheet bedsheet) {
        bedsheet.getMaterial();
        bedsheet.getSize();
        bedsheet.getColor();
        bedsheet.getPrice();
        bedsheet.getPattern();

        if (bedsheet instanceof CottonBedsheet) {
            System.out.println("Bedsheet is instance of CottonBedsheet");
            CottonBedsheet cottonBedsheet = (CottonBedsheet) bedsheet;
            cottonBedsheet.getThreadCount();
        }
    }
}


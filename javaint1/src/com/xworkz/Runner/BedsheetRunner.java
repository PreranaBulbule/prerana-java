package com.xworkz.Runner;
import com.xworkz.override21.Bedsheet;
import com.xworkz.override21.BedsheetStore;
import com.xworkz.override21.CottonBedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet bedsheet1 = new Bedsheet();
        bedsheet1.getMaterial();
        bedsheet1.getSize();
        bedsheet1.getColor();
        bedsheet1.getPrice();
        bedsheet1.getPattern();

        System.out.println("-------------------");
        Bedsheet bedsheet2 = new CottonBedsheet();
        bedsheet2.getMaterial();
        bedsheet2.getSize();
        bedsheet2.getColor();
        bedsheet2.getPrice();
        bedsheet2.getPattern();

        System.out.println("-----------------");
        CottonBedsheet cottonBedsheet = new CottonBedsheet();
        cottonBedsheet.getMaterial();
        cottonBedsheet.getSize();
        cottonBedsheet.getColor();
        cottonBedsheet.getPrice();
        cottonBedsheet.getPattern();
        cottonBedsheet.getThreadCount();

        System.out.println("------------------");
        BedsheetStore bedsheetStore = new BedsheetStore();
        bedsheetStore.manage(bedsheet2);
        bedsheetStore.manage(bedsheet1);
        bedsheetStore.manage(cottonBedsheet);
    }
}
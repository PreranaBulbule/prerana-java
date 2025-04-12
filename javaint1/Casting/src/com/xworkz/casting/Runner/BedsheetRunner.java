package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet cottonBedsheet = new Bedsheet("Urban Ladder", "Cotton", 1200.00);
        System.out.println(cottonBedsheet);
        System.out.println("Custom hashCode (overridden): " + cottonBedsheet.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(cottonBedsheet));

        Bedsheet bedsheet1 = new Bedsheet();
        bedsheet1.setBrand("Home Centre");

        Bedsheet bedsheet2 = new Bedsheet();
        bedsheet2.setBrand("Home Centre");

        boolean same = bedsheet1.equals(bedsheet2);
        System.out.println("Both same brand: " + same);
    }
}



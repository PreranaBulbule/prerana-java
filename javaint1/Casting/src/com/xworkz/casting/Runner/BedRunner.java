package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bed;

public class BedRunner {
    public static void main(String[] args) {
        Bed kingSizeBed = new Bed("Springwel", "King Size", 25000.00);
        System.out.println(kingSizeBed);
        System.out.println("Custom hashCode (overridden): " + kingSizeBed.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(kingSizeBed));

        Bed bed1 = new Bed();
        bed1.setBrand("Kurlon");

        Bed bed2 = new Bed();
        bed2.setBrand("Kurlon");

        boolean same = bed1.equals(bed2);
        System.out.println("Both same brand: " + same);
    }
}



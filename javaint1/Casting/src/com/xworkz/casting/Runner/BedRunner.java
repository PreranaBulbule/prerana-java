package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bed;

public class BedRunner {
    public static void main(String[] args) {
        Bed kingSizeBed = new Bed("Springwel", "King Size", 25000.00);
        System.out.println(kingSizeBed);
        System.out.println("Custom hashCode (overridden): " + kingSizeBed.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(kingSizeBed));
    }
}


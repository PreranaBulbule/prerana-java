package com.xworkz.casting.Runner;

import com.xworkz.casting.Internal.Drum;

public class DrumRunner {
    public static void main(String[] args) {
        Drum steelDrum = new Drum("Steel", 18.0, 2500.00);
        System.out.println(steelDrum);
        System.out.println("Custom hashCode (overridden): " + steelDrum.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(steelDrum));

        Drum drum1 = new Drum("Steel", 18.0, 2500.00);
        Drum drum2 = new Drum("Steel", 18.0, 2500.00);
        boolean same = drum1.equals(drum2);
        System.out.println("Both drums are same: " + same);

        Drum drum3 = new Drum("Wood", 20.0, 3000.00);
        Drum drum4 = new Drum("Steel", 18.0, 2500.00);
        boolean different = drum3.equals(drum4);
        System.out.println("Both drums are same: " + different);
    }
}



package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Drum;

public class DrumRunner {
    public static void main(String[] args) {
        Drum steelDrum = new Drum("Steel", 18.0, 2500.00);
        System.out.println(steelDrum);
        System.out.println("Custom hashCode (overridden): " + steelDrum.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(steelDrum));
    }
}


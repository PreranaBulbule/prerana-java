package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Rummy;

public class RummyRunner {
    public static void main(String[] args) {
        Rummy classicRummy = new Rummy("Standard Deck", 2, 12.99);
        System.out.println(classicRummy);
        System.out.println("Custom hashCode (overridden): " + classicRummy.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(classicRummy));
    }
}


package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Rummy;

public class RummyRunner {
    public static void main(String[] args) {
        Rummy classicRummy = new Rummy("Standard Deck", 2, 12.99);
        System.out.println(classicRummy);
        System.out.println("Custom hashCode (overridden): " + classicRummy.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(classicRummy));

        Rummy r1 = new Rummy("Standard Deck", 2, 12.99);
        Rummy r2 = new Rummy("Standard Deck", 2, 12.99);
        boolean same = r1.equals(r2);
        System.out.println("Both rummy games are same: " + same);

        Rummy r3 = new Rummy("Special Deck", 4, 15.99);
        Rummy r4 = new Rummy("Standard Deck", 2, 12.99);
        boolean different = r3.equals(r4);
        System.out.println("Both rummy games are same: " + different);
    }
}

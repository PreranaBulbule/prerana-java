package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.NailPolish;

public class NailPolishRunner {
    public static void main(String[] args) {
        NailPolish lakmeNailPolish = new NailPolish("Lakme", "Red", 150.00);
        System.out.println(lakmeNailPolish);
        System.out.println("Custom hashCode (overridden): " + lakmeNailPolish.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(lakmeNailPolish));

        NailPolish nailPolish1 = new NailPolish("Lakme", "Red", 150.00);
        NailPolish nailPolish2 = new NailPolish("Lakme", "Red", 150.00);
        boolean same = nailPolish1.equals(nailPolish2);
        System.out.println("Both nail polishes are same: " + same);

        NailPolish nailPolish3 = new NailPolish("Maybelline", "Pink", 250.00);
        NailPolish nailPolish4 = new NailPolish("Lakme", "Red", 150.00);
        boolean different = nailPolish3.equals(nailPolish4);
        System.out.println("Both nail polishes are same: " + different);
    }
}

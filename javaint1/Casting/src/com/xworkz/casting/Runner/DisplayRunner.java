package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Display;

public class DisplayRunner {
    public static void main(String[] args) {
        Display ledDisplay = new Display("Samsung", "LED", 25000.00);
        System.out.println(ledDisplay);
        System.out.println("Custom hashCode (overridden): " + ledDisplay.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(ledDisplay));

        Display d1 = new Display();
        d1.setBrand("Samsung");

        Display d2 = new Display();
        d2.setBrand("Samsung");

        boolean same = d1.equals(d2);
        System.out.println("Both same brand: " + same);
    }
}



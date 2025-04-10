package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Resort;

public class ResortRunner {
    public static void main(String[] args) {
        Resort beachResort = new Resort("Sunset Beach Resort", "Goa", 150.00);
        System.out.println(beachResort);
        System.out.println("Custom hashCode (overridden): " + beachResort.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(beachResort));
    }
}



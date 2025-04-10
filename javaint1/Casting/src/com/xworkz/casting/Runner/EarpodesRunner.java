package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Earpodes;

public class EarpodesRunner {
    public static void main(String[] args) {
        Earpodes appleEarpodes = new Earpodes("Apple", "Wireless", 12000.00);
        System.out.println(appleEarpodes);
        System.out.println("Custom hashCode (overridden): " + appleEarpodes.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(appleEarpodes));
    }
}

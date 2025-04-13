package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Earpodes;

public class EarpodesRunner {
    public static void main(String[] args) {
        Earpodes appleEarpodes = new Earpodes("Apple", "Wireless", 12000.00);
        System.out.println(appleEarpodes);
        System.out.println("Custom hashCode (overridden): " + appleEarpodes.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(appleEarpodes));

        Earpodes earpodes1 = new Earpodes("Apple", "Wireless", 12000.00);
        Earpodes earpodes2 = new Earpodes("Apple", "Wireless", 12000.00);
        boolean same = earpodes1.equals(earpodes2);
        System.out.println("Both earpodes are same: " + same);

        Earpodes earpodes3 = new Earpodes("Samsung", "Wired", 8000.00);
        Earpodes earpodes4 = new Earpodes("Apple", "Wireless", 12000.00);
        boolean different = earpodes3.equals(earpodes4);
        System.out.println("Both earpodes are same: " + different);
    }
}


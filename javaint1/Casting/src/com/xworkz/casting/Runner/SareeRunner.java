package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Saree;

public class SareeRunner {
    public static void main(String[] args) {
        Saree banarasiSaree = new Saree("Banarasi", "Silk", 15000.00);
        System.out.println(banarasiSaree);
        System.out.println("Custom hashCode (overridden): " + banarasiSaree.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(banarasiSaree));
    }
}


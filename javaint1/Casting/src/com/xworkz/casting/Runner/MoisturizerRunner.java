package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Moisturizer;

public class MoisturizerRunner {
    public static void main(String[] args) {
        Moisturizer niveaMoisturizer = new Moisturizer("Nivea", "Cream", 199.99);
        System.out.println(niveaMoisturizer);
        System.out.println("Custom hashCode (overridden): " + niveaMoisturizer.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(niveaMoisturizer));
    }
}


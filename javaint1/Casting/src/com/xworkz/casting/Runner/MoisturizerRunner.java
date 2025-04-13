package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Moisturizer;

public class MoisturizerRunner {
    public static void main(String[] args) {
        Moisturizer niveaMoisturizer = new Moisturizer("Nivea", "Cream", 199.99);
        System.out.println(niveaMoisturizer);
        System.out.println("Custom hashCode (overridden): " + niveaMoisturizer.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(niveaMoisturizer));

        Moisturizer moisturizer1 = new Moisturizer("Nivea", "Cream", 199.99);
        Moisturizer moisturizer2 = new Moisturizer("Nivea", "Cream", 199.99);
        boolean same = moisturizer1.equals(moisturizer2);
        System.out.println("Both moisturizers are same: " + same);

        Moisturizer moisturizer3 = new Moisturizer("Olay", "Gel", 299.99);
        Moisturizer moisturizer4 = new Moisturizer("Nivea", "Cream", 199.99);
        boolean different = moisturizer3.equals(moisturizer4);
        System.out.println("Both moisturizers are same: " + different);
    }
}

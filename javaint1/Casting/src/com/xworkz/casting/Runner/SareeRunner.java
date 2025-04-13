package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Saree;

public class SareeRunner {
    public static void main(String[] args) {
        Saree banarasiSaree = new Saree("Banarasi", "Silk", 15000.00);
        System.out.println(banarasiSaree);
        System.out.println("Custom hashCode (overridden): " + banarasiSaree.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(banarasiSaree));

        Saree s1 = new Saree("Banarasi", "Silk", 15000.00);
        Saree s2 = new Saree("Banarasi", "Silk", 15000.00);
        boolean same = s1.equals(s2);
        System.out.println("Both sarees are same: " + same);

        Saree s3 = new Saree("Kanjivaram", "Cotton", 10000.00);
        Saree s4 = new Saree("Banarasi", "Silk", 15000.00);
        boolean different = s3.equals(s4);
        System.out.println("Both sarees are same: " + different);
    }
}

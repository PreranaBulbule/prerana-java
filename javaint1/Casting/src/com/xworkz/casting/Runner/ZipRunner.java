package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Zip;

public class ZipRunner {
    public static void main(String[] args) {
        Zip zipper = new Zip("YKK", "Black", 10.99);
        System.out.println(zipper);
        System.out.println("Custom hashCode (overridden): " + zipper.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(zipper));

        Zip z1 = new Zip("YKK", "Black", 10.99);
        Zip z2 = new Zip("YKK", "Black", 10.99);
        boolean areSame = z1.equals(z2);
        System.out.println("Are both Zip objects the same: " + areSame);

        Zip z3 = new Zip("YKK", "Red", 12.99);
        boolean areDifferent = z1.equals(z3);
        System.out.println("Are both Zip objects the same: " + areDifferent);
    }
}

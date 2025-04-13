package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Groundnut;

public class GroundnutRunner {
    public static void main(String[] args) {
        Groundnut roastedGroundnut = new Groundnut("Roasted", "Plastic Bag", 3.99);
        System.out.println(roastedGroundnut);
        System.out.println("Custom hashCode (overridden): " + roastedGroundnut.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(roastedGroundnut));

        Groundnut groundnut1 = new Groundnut("Roasted", "Plastic Bag", 3.99);
        Groundnut groundnut2 = new Groundnut("Roasted", "Plastic Bag", 3.99);
        boolean same = groundnut1.equals(groundnut2);
        System.out.println("Both groundnuts are same: " + same);

        Groundnut groundnut3 = new Groundnut("Salted", "Glass Jar", 4.49);
        Groundnut groundnut4 = new Groundnut("Roasted", "Plastic Bag", 3.99);
        boolean different = groundnut3.equals(groundnut4);
        System.out.println("Both groundnuts are same: " + different);
    }
}



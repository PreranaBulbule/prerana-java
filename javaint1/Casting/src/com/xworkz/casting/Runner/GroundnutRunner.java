package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Groundnut;

public class GroundnutRunner {
    public static void main(String[] args) {
        Groundnut roastedGroundnut = new Groundnut("Roasted", "Plastic Bag", 3.99);
        System.out.println(roastedGroundnut);
        System.out.println("Custom hashCode (overridden): " + roastedGroundnut.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(roastedGroundnut));
    }
}


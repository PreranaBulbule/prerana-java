package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle glassBottle = new Bottle("Glass", 1.5, 250.00);
        System.out.println(glassBottle);
        System.out.println("Custom hashCode (overridden): " + glassBottle.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(glassBottle));

        Bottle bottle1 = new Bottle();
        bottle1.setMaterial("Glass");

        Bottle bottle2 = new Bottle();
        bottle2.setMaterial("Glass");

        boolean same = bottle1.equals(bottle2);
        System.out.println("Both same material: " + same);
    }
}


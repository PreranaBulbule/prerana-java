package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle glassBottle = new Bottle("Glass", 1.5, 250.00);
        System.out.println(glassBottle);
        System.out.println("Custom hashCode (overridden): " + glassBottle.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(glassBottle));
    }
}


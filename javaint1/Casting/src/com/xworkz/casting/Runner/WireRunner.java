package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Wire;

public class WireRunner {
    public static void main(String[] args) {
        Wire copperWire = new Wire("Copper", 50.0, 150.00);
        System.out.println(copperWire);
        System.out.println("Custom hashCode (overridden): " + copperWire.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(copperWire));

        Wire w1 = new Wire("Copper", 50.0, 150.00);
        Wire w2 = new Wire("Copper", 50.0, 150.00);
        boolean areSame = w1.equals(w2);
        System.out.println("Are both Wire objects the same: " + areSame);

        Wire w3 = new Wire("Aluminum", 60.0, 200.00);
        boolean areDifferent = w1.equals(w3);
        System.out.println("Are both Wire objects the same: " + areDifferent);
    }
}

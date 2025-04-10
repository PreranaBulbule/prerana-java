package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Wire;

public class WireRunner {
    public static void main(String[] args) {
        Wire copperWire = new Wire("Copper", 50.0, 150.00);
        System.out.println(copperWire);
        System.out.println("Custom hashCode (overridden): " + copperWire.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(copperWire));
    }
}


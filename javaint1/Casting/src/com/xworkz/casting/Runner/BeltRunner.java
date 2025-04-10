package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Belt;

public class BeltRunner {
    public static void main(String[] args) {
        Belt leatherBelt = new Belt("Leather", "Brown", 19.99);
        System.out.println(leatherBelt);
        System.out.println("Custom hashCode (overridden): " + leatherBelt.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(leatherBelt));
    }
}


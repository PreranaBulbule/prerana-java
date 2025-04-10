package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.River;

public class RiverRunner {
    public static void main(String[] args) {
        River nileRiver = new River("Nile", "Egypt", 6650);
        System.out.println(nileRiver);
        System.out.println("Custom hashCode (overridden): " + nileRiver.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(nileRiver));
    }
}


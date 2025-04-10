package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe runningShoe = new Shoe("Nike", "Running", 75.99);
        System.out.println(runningShoe);
        System.out.println("Custom hashCode (overridden): " + runningShoe.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(runningShoe));
    }
}


package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Specs;

public class SpecsRunner {
    public static void main(String[] args) {
        Specs sunglasses = new Specs("Ray-Ban", "Metal", 199.99);
        System.out.println(sunglasses);
        System.out.println("Custom hashCode (overridden): " + sunglasses.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(sunglasses));
    }
}


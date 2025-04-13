package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Specs;

public class SpecsRunner {
    public static void main(String[] args) {
        Specs sunglasses = new Specs("Ray-Ban", "Metal", 199.99);
        System.out.println(sunglasses);
        System.out.println("Custom hashCode (overridden): " + sunglasses.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(sunglasses));

        Specs s1 = new Specs("Ray-Ban", "Metal", 199.99);
        Specs s2 = new Specs("Ray-Ban", "Metal", 199.99);
        boolean same = s1.equals(s2);
        System.out.println("Both specs are same: " + same);

        Specs s3 = new Specs("Oakley", "Plastic", 150.00);
        Specs s4 = new Specs("Ray-Ban", "Metal", 199.99);
        boolean different = s3.equals(s4);
        System.out.println("Both specs are same: " + different);
    }
}

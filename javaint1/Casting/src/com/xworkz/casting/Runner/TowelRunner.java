package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel cottonTowel = new Towel("AmazonBasics", "Cotton", 499.99);
        System.out.println(cottonTowel);
        System.out.println("Custom hashCode (overridden): " + cottonTowel.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(cottonTowel));
    }
}


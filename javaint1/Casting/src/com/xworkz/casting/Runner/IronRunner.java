package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Iron;

public class IronRunner {
    public static void main(String[] args) {
        Iron steamIron = new Iron("Steam Iron", "Metal", 1499.99);
        System.out.println(steamIron);
        System.out.println("Custom hashCode (overridden): " + steamIron.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(steamIron));
    }
}


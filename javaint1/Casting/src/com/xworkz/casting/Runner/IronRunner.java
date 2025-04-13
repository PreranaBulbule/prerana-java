package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Iron;

public class IronRunner {
    public static void main(String[] args) {
        Iron steamIron = new Iron("Steam Iron", "Metal", 1499.99);
        System.out.println(steamIron);
        System.out.println("Custom hashCode (overridden): " + steamIron.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(steamIron));

        Iron iron1 = new Iron("Steam Iron", "Metal", 1499.99);
        Iron iron2 = new Iron("Steam Iron", "Metal", 1499.99);
        boolean same = iron1.equals(iron2);
        System.out.println("Both irons are same: " + same);

        Iron iron3 = new Iron("Dry Iron", "Plastic", 799.99);
        Iron iron4 = new Iron("Steam Iron", "Metal", 1499.99);
        boolean different = iron3.equals(iron4);
        System.out.println("Both irons are same: " + different);
    }
}



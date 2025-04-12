package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle mountainBike = new Bicycle("Trek", "Mountain Bike", 25000.00);
        System.out.println(mountainBike);
        System.out.println("Custom hashCode (overridden): " + mountainBike.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(mountainBike));

        Bicycle bicycle1 = new Bicycle();
        bicycle1.setBrand("Trek");

        Bicycle bicycle2 = new Bicycle();
        bicycle2.setBrand("Trek");

        boolean same = bicycle1.equals(bicycle2);
        System.out.println("Both same brand: " + same);
    }
}



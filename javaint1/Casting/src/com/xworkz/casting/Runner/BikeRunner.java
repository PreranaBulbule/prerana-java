package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike sportBike = new Bike("Yamaha R15", "Blue", 150000.00);
        System.out.println(sportBike);
        System.out.println("Custom hashCode (overridden): " + sportBike.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(sportBike));
    }
}


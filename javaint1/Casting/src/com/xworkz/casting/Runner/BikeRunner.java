package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike sportBike = new Bike("Yamaha R15", "Blue", 150000.00);
        System.out.println(sportBike);
        System.out.println("Custom hashCode (overridden): " + sportBike.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(sportBike));

        Bike bike1 = new Bike();
        bike1.setModel("Yamaha R15");

        Bike bike2 = new Bike();
        bike2.setModel("Yamaha R15");

        boolean same = bike1.equals(bike2);
        System.out.println("Both same model: " + same);
    }
}



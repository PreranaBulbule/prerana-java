package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Charger;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger samsungCharger = new Charger("Samsung", "USB-C", 15.99);
        System.out.println(samsungCharger);
        System.out.println("Custom hashCode (overridden): " + samsungCharger.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(samsungCharger));

        Charger charger1 = new Charger();
        charger1.setBrand("Samsung");

        Charger charger2 = new Charger();
        charger2.setBrand("Samsung");

        boolean same = charger1.equals(charger2);
        System.out.println("Both same brand: " + same);
    }
}




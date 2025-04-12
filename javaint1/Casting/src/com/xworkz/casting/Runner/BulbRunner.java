package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bulb;

public class BulbRunner {
    public static void main(String[] args) {
        Bulb ledBulb = new Bulb("Philips", "LED", 8.99);
        System.out.println(ledBulb);
        System.out.println("Custom hashCode (overridden): " + ledBulb.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(ledBulb));

        Bulb bulb1 = new Bulb();
        bulb1.setBrand("Philips");

        Bulb bulb2 = new Bulb();
        bulb2.setBrand("Philips");

        boolean same = bulb1.equals(bulb2);
        System.out.println("Both same brand: " + same);
    }
}




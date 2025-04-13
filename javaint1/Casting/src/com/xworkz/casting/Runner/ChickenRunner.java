package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Chicken;

public class ChickenRunner {
    public static void main(String[] args) {
        Chicken grilledChicken = new Chicken("Broiler", "Breast", 12.99);
        System.out.println(grilledChicken);
        System.out.println("Custom hashCode (overridden): " + grilledChicken.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(grilledChicken));

        Chicken c1 = new Chicken();
        c1.setBreed("Broiler");

        Chicken c2 = new Chicken();
        c2.setBreed("Broiler");

        boolean same = c1.equals(c2);
        System.out.println("Both same breed: " + same);
    }
}


package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Donut;

public class DonutRunner {
    public static void main(String[] args) {
        Donut chocolateDonut = new Donut("Chocolate", "Medium", 50.00);
        System.out.println(chocolateDonut);
        System.out.println("Custom hashCode (overridden): " + chocolateDonut.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(chocolateDonut));

        Donut donut1 = new Donut("Chocolate", "Medium", 50.00);
        Donut donut2 = new Donut("Chocolate", "Medium", 50.00);
        boolean same = donut1.equals(donut2);
        System.out.println("Both donuts are same: " + same);

        Donut donut3 = new Donut("Strawberry", "Large", 60.00);
        Donut donut4 = new Donut("Chocolate", "Small", 50.00);
        boolean different = donut3.equals(donut4);
        System.out.println("Both donuts are same: " + different);
    }
}



package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Donut;

public class DonutRunner {
    public static void main(String[] args) {
        Donut chocolateDonut = new Donut("Chocolate", "Medium", 50.00);
        System.out.println(chocolateDonut);
        System.out.println("Custom hashCode (overridden): " + chocolateDonut.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(chocolateDonut));
    }
}


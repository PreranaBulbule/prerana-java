package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Hat;

public class HatRunner {
    public static void main(String[] args) {
        Hat baseballHat = new Hat("Nike", "Red", 1200.00);
        System.out.println(baseballHat);
        System.out.println("Custom hashCode (overridden): " + baseballHat.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(baseballHat));
    }
}


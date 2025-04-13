package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Hat;

public class HatRunner {
    public static void main(String[] args) {
        Hat baseballHat = new Hat("Nike", "Red", 1200.00);
        System.out.println(baseballHat);
        System.out.println("Custom hashCode (overridden): " + baseballHat.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(baseballHat));

        Hat hat1 = new Hat("Nike", "Red", 1200.00);
        Hat hat2 = new Hat("Nike", "Red", 1200.00);
        boolean same = hat1.equals(hat2);
        System.out.println("Both hats are same: " + same);

        Hat hat3 = new Hat("Adidas", "Blue", 1300.00);
        Hat hat4 = new Hat("Nike", "Red", 1200.00);
        boolean different = hat3.equals(hat4);
        System.out.println("Both hats are same: " + different);
    }
}



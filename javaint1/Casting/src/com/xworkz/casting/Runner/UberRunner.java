package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Uber;

public class UberRunner {
    public static void main(String[] args) {
        Uber uberCab = new Uber("Mercedes-Benz E-Class", "Silver", 1200.00);
        System.out.println(uberCab);
        System.out.println("Custom hashCode (overridden): " + uberCab.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(uberCab));

        Uber u1 = new Uber("Mercedes-Benz E-Class", "Silver", 1200.00);
        Uber u2 = new Uber("Mercedes-Benz E-Class", "Silver", 1200.00);
        boolean same = u1.equals(u2);
        System.out.println("Both Ubers are same: " + same);

        Uber u3 = new Uber("BMW 5 Series", "Black", 1300.00);
        boolean different = u1.equals(u3);
        System.out.println("Both Ubers are same: " + different);
    }
}

package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Lunchbox;

public class LunchboxRunner {
    public static void main(String[] args) {
        Lunchbox steelLunchbox = new Lunchbox("Steel", "Silver", 12.50);
        System.out.println(steelLunchbox);
        System.out.println("Custom hashCode (overridden): " + steelLunchbox.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(steelLunchbox));

        Lunchbox lunchbox1 = new Lunchbox("Steel", "Silver", 12.50);
        Lunchbox lunchbox2 = new Lunchbox("Steel", "Silver", 12.50);
        boolean same = lunchbox1.equals(lunchbox2);
        System.out.println("Both lunchboxes are same: " + same);

        Lunchbox lunchbox3 = new Lunchbox("Plastic", "Red", 8.00);
        Lunchbox lunchbox4 = new Lunchbox("Steel", "Blue", 15.00);
        boolean different = lunchbox3.equals(lunchbox4);
        System.out.println("Both lunchboxes are same: " + different);
    }
}

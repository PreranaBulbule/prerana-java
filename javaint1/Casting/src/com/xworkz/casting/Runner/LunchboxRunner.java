package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Lunchbox;

public class LunchboxRunner {
    public static void main(String[] args) {
        Lunchbox steelLunchbox = new Lunchbox("Steel", "Silver", 12.50);
        System.out.println(steelLunchbox);
        System.out.println("Custom hashCode (overridden): " + steelLunchbox.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(steelLunchbox));
    }
}


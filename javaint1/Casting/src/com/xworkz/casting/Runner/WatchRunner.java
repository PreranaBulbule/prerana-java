package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch rolexWatch = new Watch("Rolex", "Analog", 7999.99);
        System.out.println(rolexWatch);
        System.out.println("Custom hashCode (overridden): " + rolexWatch.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(rolexWatch));

        Watch w1 = new Watch("Rolex", "Analog", 7999.99);
        Watch w2 = new Watch("Rolex", "Analog", 7999.99);
        boolean areSame = w1.equals(w2);
        System.out.println("Are both Watch objects the same: " + areSame);

        Watch w3 = new Watch("Casio", "Digital", 500.00);
        boolean areDifferent = w1.equals(w3);
        System.out.println("Are both Watch objects the same: " + areDifferent);
    }
}

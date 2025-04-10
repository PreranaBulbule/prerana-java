package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch rolexWatch = new Watch("Rolex", "Analog", 7999.99);
        System.out.println(rolexWatch);
        System.out.println("Custom hashCode (overridden): " + rolexWatch.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(rolexWatch));
    }
}


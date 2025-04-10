package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Watchman;

public class WatchmanRunner {
    public static void main(String[] args) {
        Watchman nightWatchman = new Watchman("John Doe", "Night", 1200.00);
        System.out.println(nightWatchman);
        System.out.println("Custom hashCode (overridden): " + nightWatchman.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(nightWatchman));
    }
}


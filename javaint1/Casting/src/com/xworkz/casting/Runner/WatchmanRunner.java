package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Watchman;

public class WatchmanRunner {
    public static void main(String[] args) {
        Watchman nightWatchman = new Watchman("John Doe", "Night", 1200.00);
        System.out.println(nightWatchman);
        System.out.println("Custom hashCode (overridden): " + nightWatchman.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(nightWatchman));

        Watchman wm1 = new Watchman("John Doe", "Night", 1200.00);
        Watchman wm2 = new Watchman("John Doe", "Night", 1200.00);
        boolean same = wm1.equals(wm2);
        System.out.println("Both Watchman objects are the same: " + same);

        Watchman wm3 = new Watchman("Jane Smith", "Morning", 1500.00);
        boolean different = wm1.equals(wm3);
        System.out.println("Both Watchman objects are the same: " + different);
    }
}

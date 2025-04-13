package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Window;

public class WindowRunner {
    public static void main(String[] args) {
        Window slidingWindow = new Window("Wood", "Sliding", 150.00);
        System.out.println(slidingWindow);
        System.out.println("Custom hashCode (overridden): " + slidingWindow.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(slidingWindow));

        Window w1 = new Window("Wood", "Sliding", 150.00);
        Window w2 = new Window("Wood", "Sliding", 150.00);
        boolean areSame = w1.equals(w2);
        System.out.println("Are both Window objects the same: " + areSame);

        Window w3 = new Window("Glass", "Casement", 180.00);
        boolean areDifferent = w1.equals(w3);
        System.out.println("Are both Window objects the same: " + areDifferent);
    }
}

package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Window;

public class WindowRunner {
    public static void main(String[] args) {
        Window slidingWindow = new Window("Wood", "Sliding", 150.00);
        System.out.println(slidingWindow);
        System.out.println("Custom hashCode (overridden): " + slidingWindow.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(slidingWindow));
    }
}



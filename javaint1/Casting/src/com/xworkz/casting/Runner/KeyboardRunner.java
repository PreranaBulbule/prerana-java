package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard mechanicalKeyboard = new Keyboard("Mechanical Keyboard", "Mechanical", 1299.99);
        System.out.println(mechanicalKeyboard);
        System.out.println("Custom hashCode (overridden): " + mechanicalKeyboard.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(mechanicalKeyboard));

        Keyboard keyboard1 = new Keyboard("Mechanical Keyboard", "Mechanical", 1299.99);
        Keyboard keyboard2 = new Keyboard("Mechanical Keyboard", "Mechanical", 1299.99);
        boolean same = keyboard1.equals(keyboard2);
        System.out.println("Both keyboards are same: " + same);

        Keyboard keyboard3 = new Keyboard("Wireless Keyboard", "Wireless", 1599.99);
        Keyboard keyboard4 = new Keyboard("Mechanical Keyboard", "Mechanical", 1299.99);
        boolean different = keyboard3.equals(keyboard4);
        System.out.println("Both keyboards are same: " + different);
    }
}

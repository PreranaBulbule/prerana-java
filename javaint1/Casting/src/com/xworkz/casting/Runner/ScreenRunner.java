package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Screen;

public class ScreenRunner {
    public static void main(String[] args) {
        Screen ledScreen = new Screen("LED", 55.0, 25000.00);
        System.out.println(ledScreen);
        System.out.println("Custom hashCode (overridden): " + ledScreen.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(ledScreen));
    }
}


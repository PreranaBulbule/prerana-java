package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard mechanicalKeyboard = new Keyboard("Mechanical Keyboard", "Mechanical", 1299.99);
        System.out.println(mechanicalKeyboard);
    }
}

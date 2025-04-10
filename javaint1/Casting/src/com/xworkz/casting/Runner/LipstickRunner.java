package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Lipstick;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick maybellineLipstick = new Lipstick("Maybelline", "Red", 350.00);
        System.out.println(maybellineLipstick);
        System.out.println("Custom hashCode (overridden): " + maybellineLipstick.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(maybellineLipstick));
    }
}


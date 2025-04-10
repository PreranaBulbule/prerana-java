package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.NailPolish;

public class NailPolishRunner {
    public static void main(String[] args) {
        NailPolish lakmeNailPolish = new NailPolish("Lakme", "Red", 150.00);
        System.out.println(lakmeNailPolish);
        System.out.println("Custom hashCode (overridden): " + lakmeNailPolish.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(lakmeNailPolish));
    }
}

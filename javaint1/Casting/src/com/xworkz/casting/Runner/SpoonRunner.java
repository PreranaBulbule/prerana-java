package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Spoon;

public class SpoonRunner {
    public static void main(String[] args) {
        Spoon silverSpoon = new Spoon("Silver", "Medium", 150.00);
        System.out.println(silverSpoon);
        System.out.println("Custom hashCode (overridden): " + silverSpoon.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(silverSpoon));
    }
}


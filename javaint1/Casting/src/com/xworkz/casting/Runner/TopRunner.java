package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Top;

public class TopRunner {
    public static void main(String[] args) {
        Top nikeTop = new Top("Nike", "Medium", 29.99);
        System.out.println(nikeTop);
        System.out.println("Custom hashCode (overridden): " + nikeTop.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(nikeTop));
    }
}

package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.TShirt;

public class TShirtRunner {
    public static void main(String[] args) {
        TShirt nikeTShirt = new TShirt("Nike", "L", 799.99);
        System.out.println(nikeTShirt);
        System.out.println("Custom hashCode (overridden): " + nikeTShirt.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(nikeTShirt));
    }
}


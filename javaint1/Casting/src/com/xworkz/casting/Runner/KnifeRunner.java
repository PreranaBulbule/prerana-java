package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Knife;

public class KnifeRunner {
    public static void main(String[] args) {
        Knife victorinoxKnife = new Knife("Victorinox", "Stainless Steel", 2500.00);
        System.out.println(victorinoxKnife);
        System.out.println("Custom hashCode (overridden): " + victorinoxKnife.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(victorinoxKnife));
    }
}


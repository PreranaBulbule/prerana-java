package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Top;

public class TopRunner {
    public static void main(String[] args) {
        Top nikeTop = new Top("Nike", "Medium", 29.99);
        System.out.println(nikeTop);
        System.out.println("Custom hashCode (overridden): " + nikeTop.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(nikeTop));

        Top t1 = new Top("Nike", "Medium", 29.99);
        Top t2 = new Top("Nike", "Medium", 29.99);
        boolean same = t1.equals(t2);
        System.out.println("Both tops are same: " + same);

        Top t3 = new Top("Adidas", "Large", 39.99);
        boolean different = t1.equals(t3);
        System.out.println("Both tops are same: " + different);
    }
}

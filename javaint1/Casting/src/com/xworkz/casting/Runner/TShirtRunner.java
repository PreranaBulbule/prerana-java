package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.TShirt;

public class TShirtRunner {
    public static void main(String[] args) {
        TShirt nikeTShirt = new TShirt("Nike", "L", 799.99);
        System.out.println(nikeTShirt);
        System.out.println("Custom hashCode (overridden): " + nikeTShirt.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(nikeTShirt));

        TShirt t1 = new TShirt("Nike", "L", 799.99);
        TShirt t2 = new TShirt("Nike", "L", 799.99);
        boolean same = t1.equals(t2);
        System.out.println("Both TShirts are same: " + same);

        TShirt t3 = new TShirt("Adidas", "M", 899.99);
        boolean different = t1.equals(t3);
        System.out.println("Both TShirts are same: " + different);
    }
}

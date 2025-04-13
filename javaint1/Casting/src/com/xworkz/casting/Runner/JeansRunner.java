package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Jeans;

public class JeansRunner {
    public static void main(String[] args) {
        Jeans leviJeans = new Jeans("Levi's", "32", 2499.99);
        System.out.println(leviJeans);
        System.out.println("Custom hashCode (overridden): " + leviJeans.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(leviJeans));

        Jeans jeans1 = new Jeans("Levi's", "32", 2499.99);
        Jeans jeans2 = new Jeans("Levi's", "32", 2499.99);
        boolean same = jeans1.equals(jeans2);
        System.out.println("Both jeans are same: " + same);

        Jeans jeans3 = new Jeans("Wrangler", "34", 1999.99);
        Jeans jeans4 = new Jeans("Levi's", "32", 2499.99);
        boolean different = jeans3.equals(jeans4);
        System.out.println("Both jeans are same: " + different);
    }
}

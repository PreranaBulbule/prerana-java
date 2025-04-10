package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Jeans;

public class JeansRunner {
    public static void main(String[] args) {
        Jeans leviJeans = new Jeans("Levi's", "32", 2499.99);
        System.out.println(leviJeans);
        System.out.println("Custom hashCode (overridden): " + leviJeans.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(leviJeans));
    }
}


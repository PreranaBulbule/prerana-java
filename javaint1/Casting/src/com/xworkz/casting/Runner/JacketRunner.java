package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Jacket;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket leatherJacket = new Jacket("Levi's", "Leather", 4999.99);
        System.out.println(leatherJacket);
        System.out.println("Custom hashCode (overridden): " + leatherJacket.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(leatherJacket));
    }
}


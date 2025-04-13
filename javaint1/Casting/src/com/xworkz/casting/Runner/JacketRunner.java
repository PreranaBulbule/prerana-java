package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Jacket;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket leatherJacket = new Jacket("Levi's", "Leather", 4999.99);
        System.out.println(leatherJacket);
        System.out.println("Custom hashCode (overridden): " + leatherJacket.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(leatherJacket));

        Jacket jacket1 = new Jacket("Levi's", "Leather", 4999.99);
        Jacket jacket2 = new Jacket("Levi's", "Leather", 4999.99);
        boolean same = jacket1.equals(jacket2);
        System.out.println("Both jackets are same: " + same);

        Jacket jacket3 = new Jacket("Nike", "Fabric", 2999.99);
        Jacket jacket4 = new Jacket("Levi's", "Leather", 4999.99);
        boolean different = jacket3.equals(jacket4);
        System.out.println("Both jackets are same: " + different);
    }
}



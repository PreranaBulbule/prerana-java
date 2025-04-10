package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Ola;

public class OlaRunner {
    public static void main(String[] args) {
        Ola olaCab = new Ola("Toyota Innova", "White", 350.00);
        System.out.println(olaCab);
        System.out.println("Custom hashCode (overridden): " + olaCab.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(olaCab));
    }
}


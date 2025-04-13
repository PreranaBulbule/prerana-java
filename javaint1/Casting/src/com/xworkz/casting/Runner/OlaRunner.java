package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Ola;

public class OlaRunner {
    public static void main(String[] args) {
        Ola olaCab = new Ola("Toyota Innova", "White", 350.00);
        System.out.println(olaCab);
        System.out.println("Custom hashCode (overridden): " + olaCab.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(olaCab));

        Ola ola1 = new Ola("Toyota Innova", "White", 350.00);
        Ola ola2 = new Ola("Toyota Innova", "White", 350.00);
        boolean same = ola1.equals(ola2);
        System.out.println("Both Ola cabs are same: " + same);

        Ola ola3 = new Ola("Honda City", "Red", 400.00);
        Ola ola4 = new Ola("Toyota Innova", "White", 350.00);
        boolean different = ola3.equals(ola4);
        System.out.println("Both Ola cabs are same: " + different);
    }
}

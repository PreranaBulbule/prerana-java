package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bag;

public class BagRunner {
    public static void main(String[] args) {
        Bag b = new Bag();
        System.out.println(b);
        System.out.println(new Bag().hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(b));

        Bag bag1 = new Bag();
        bag1.setBrand("Nike");

        Bag bag2 = new Bag();
        bag2.setBrand("Adidas");

        boolean same = bag1.equals(bag2);
        System.out.println("Both same brand: " + same);
    }
}


package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Carrybag;

public class CarrybagRunner {
    public static void main(String[] args) {
        Carrybag reusableBag = new Carrybag("Cotton", "Green", 5.99);
        System.out.println(reusableBag);
        System.out.println("Custom hashCode (overridden): " + reusableBag.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(reusableBag));

        Carrybag bag1 = new Carrybag();
        bag1.setMaterial("Cotton");

        Carrybag bag2 = new Carrybag();
        bag2.setMaterial("Cotton");

        boolean same = bag1.equals(bag2);
        System.out.println("Both same material: " + same);
    }
}




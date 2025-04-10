package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bag;

public class BagRunner {
    public static void main(String[] args) {
        Bag nikeBag = new Bag("Nike", "Backpack", 1200.00);
        System.out.println(nikeBag);
        System.out.println("Custom hashCode (overridden): " + nikeBag.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(nikeBag));
    }
}

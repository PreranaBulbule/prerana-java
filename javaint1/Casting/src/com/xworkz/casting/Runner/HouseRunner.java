package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.House;

public class HouseRunner {
    public static void main(String[] args) {
        House villa = new House("123 Palm Street, California", 4, 1200000.00);
        System.out.println(villa);
        System.out.println("Custom hashCode (overridden): " + villa.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(villa));
    }
}


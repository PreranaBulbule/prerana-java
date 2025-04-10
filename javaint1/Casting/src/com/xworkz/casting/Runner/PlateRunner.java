package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Plate;

public class PlateRunner {
    public static void main(String[] args) {
        Plate ceramicPlate = new Plate("Ceramic", "12 inch", 500.00);
        System.out.println(ceramicPlate);
        System.out.println("Custom hashCode (overridden): " + ceramicPlate.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(ceramicPlate));
    }
}


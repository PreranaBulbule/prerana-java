package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Plate;

public class PlateRunner {
    public static void main(String[] args) {
        Plate ceramicPlate = new Plate("Ceramic", "12 inch", 500.00);
        System.out.println(ceramicPlate);
        System.out.println("Custom hashCode (overridden): " + ceramicPlate.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(ceramicPlate));

        Plate plate1 = new Plate("Ceramic", "12 inch", 500.00);
        Plate plate2 = new Plate("Ceramic", "12 inch", 500.00);
        boolean areSame = plate1.equals(plate2);
        System.out.println("Are both plates the same? " + areSame);

        Plate plate3 = new Plate("Glass", "10 inch", 400.00);
        boolean areDifferent = plate1.equals(plate3);
        System.out.println("Are both plates the same? " + areDifferent);
    }
}

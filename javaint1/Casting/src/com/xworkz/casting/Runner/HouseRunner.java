package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.House;

public class HouseRunner {
    public static void main(String[] args) {
        House villa = new House("123 Palm Street, California", 4, 1200000.00);
        System.out.println(villa);
        System.out.println("Custom hashCode (overridden): " + villa.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(villa));

        House house1 = new House("123 Palm Street, California", 4, 1200000.00);
        House house2 = new House("123 Palm Street, California", 4, 1200000.00);
        boolean same = house1.equals(house2);
        System.out.println("Both houses are same: " + same);

        House house3 = new House("456 Oak Street, California", 3, 1100000.00);
        House house4 = new House("123 Palm Street, California", 4, 1200000.00);
        boolean different = house3.equals(house4);
        System.out.println("Both houses are same: " + different);
    }
}



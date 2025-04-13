package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Floor;

public class FloorRunner {
    public static void main(String[] args) {
        Floor ceramicFloor = new Floor("Ceramic", "Beige", 15.75);
        System.out.println(ceramicFloor);
        System.out.println("Custom hashCode (overridden): " + ceramicFloor.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(ceramicFloor));

        Floor floor1 = new Floor("Ceramic", "Beige", 15.75);
        Floor floor2 = new Floor("Ceramic", "Beige", 15.75);
        boolean same = floor1.equals(floor2);
        System.out.println("Both floors are same: " + same);

        Floor floor3 = new Floor("Wood", "Dark", 20.00);
        Floor floor4 = new Floor("Ceramic", "Beige", 15.75);
        boolean different = floor3.equals(floor4);
        System.out.println("Both floors are same: " + different);
    }
}



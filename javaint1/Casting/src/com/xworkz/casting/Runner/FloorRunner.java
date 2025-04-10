package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Floor;

public class FloorRunner {
    public static void main(String[] args) {
        Floor ceramicFloor = new Floor("Ceramic", "Beige", 15.75);
        System.out.println(ceramicFloor);
        System.out.println("Custom hashCode (overridden): " + ceramicFloor.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(ceramicFloor));
    }
}


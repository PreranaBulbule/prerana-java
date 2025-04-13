package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door woodenDoor = new Door("Wood", "Brown", 1200.00);
        System.out.println(woodenDoor);
        System.out.println("Custom hashCode (overridden): " + woodenDoor.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(woodenDoor));

        Door door1 = new Door("Wood", "Brown", 1200.00);
        Door door2 = new Door("Wood", "Brown", 1200.00);
        boolean same = door1.equals(door2);
        System.out.println("Both doors are same: " + same);

        Door door3 = new Door("Metal", "Black", 1500.00);
        Door door4 = new Door("Wood", "Brown", 1200.00);
        boolean different = door3.equals(door4);
        System.out.println("Both doors are same: " + different);
    }
}



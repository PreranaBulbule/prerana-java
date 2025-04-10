package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door woodenDoor = new Door("Wood", "Brown", 1200.00);
        System.out.println(woodenDoor);
        System.out.println("Custom hashCode (overridden): " + woodenDoor.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(woodenDoor));
    }
}


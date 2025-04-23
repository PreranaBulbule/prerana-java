package com.xworkz.Interface.Internal;

public class WoodenDoorPackagerImpl implements DoorPackager {
    public WoodenDoorPackagerImpl() {
        System.out.println("No-arg constructor of WoodenDoorPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing door using Wooden Door Packager");
    }
}

package com.xworkz.Interface.Internal;

public class GrilledChickenPackagerImpl implements ChickenPackager {
    public GrilledChickenPackagerImpl() {
        System.out.println("No-arg constructor of GrilledChickenPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing chicken using Grilled Chicken Packager");
    }
}

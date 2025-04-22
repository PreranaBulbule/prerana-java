package com.xworkz.Interface.Internal;

public class OrganicTomatoPackagerImpl implements TomatoPackager {
    public OrganicTomatoPackagerImpl() {
        System.out.println("No-arg constructor of OrganicTomatoPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing tomato using Organic Tomato Packager");
    }
}

package com.xworkz.Interface.Internal;

public class FreshStrawberryPackagerImpl implements StrawberryPackager {
    public FreshStrawberryPackagerImpl() {
        System.out.println("No-arg constructor of FreshStrawberryPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing strawberries using Fresh Strawberry Packager");
    }
}

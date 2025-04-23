package com.xworkz.Interface.Internal;

public class ChickenKfcPackagerImpl implements KfcPackager {
    public ChickenKfcPackagerImpl() {
        System.out.println("No-arg constructor of ChickenKfcPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing KFC items using Chicken KFC Packager");
    }
}

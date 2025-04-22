package com.xworkz.Interface.Internal;

public class BoeingPackagerImpl implements PlanePackager {
    public BoeingPackagerImpl() {
        System.out.println("No-arg constructor of BoeingPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing airplane using Boeing Packager");
    }
}

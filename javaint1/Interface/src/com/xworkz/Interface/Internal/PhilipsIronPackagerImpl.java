package com.xworkz.Interface.Internal;

public class PhilipsIronPackagerImpl implements IronPackager {
    public PhilipsIronPackagerImpl() {
        System.out.println("No-arg constructor of PhilipsIronPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing iron using Philips Iron Packager");
    }
}
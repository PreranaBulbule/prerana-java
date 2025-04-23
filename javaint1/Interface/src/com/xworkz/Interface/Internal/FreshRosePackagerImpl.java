package com.xworkz.Interface.Internal;

public class FreshRosePackagerImpl implements RosePackager {
    public FreshRosePackagerImpl() {
        System.out.println("No-arg constructor of FreshRosePackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing roses using Fresh Rose Packager");
    }
}

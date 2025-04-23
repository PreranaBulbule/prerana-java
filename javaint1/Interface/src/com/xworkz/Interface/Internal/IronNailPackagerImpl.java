package com.xworkz.Interface.Internal;

public class IronNailPackagerImpl implements NailPackager {
    public IronNailPackagerImpl() {
        System.out.println("No-arg constructor of IronNailPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing nails using Iron Nail Packager");
    }
}

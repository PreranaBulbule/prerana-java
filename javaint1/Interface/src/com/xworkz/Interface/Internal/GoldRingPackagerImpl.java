package com.xworkz.Interface.Internal;

public class GoldRingPackagerImpl implements RingPackager {
    public GoldRingPackagerImpl() {
        System.out.println("No-arg constructor of GoldRingPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing ring using Gold Ring Packager");
    }
}

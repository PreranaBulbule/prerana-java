package com.xworkz.Interface.Internal;

public class WildcraftPackerImpl implements BagPacker {
    public WildcraftPackerImpl() {
        System.out.println("No-arg constructor of WildcraftPackerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing bag using Wildcraft packer");
    }
}
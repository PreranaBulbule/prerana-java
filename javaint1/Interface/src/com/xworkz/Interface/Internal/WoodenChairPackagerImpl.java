package com.xworkz.Interface.Internal;

public class WoodenChairPackagerImpl implements ChairPackager {
    public WoodenChairPackagerImpl() {
        System.out.println("No-arg constructor of WoodenChairPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing chair using Wooden Chair Packager");
    }
}

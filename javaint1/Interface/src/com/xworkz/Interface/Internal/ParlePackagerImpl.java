package com.xworkz.Interface.Internal;

public class ParlePackagerImpl implements BiscuitPackager {
    public ParlePackagerImpl() {
        System.out.println("No-arg constructor of ParlePackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing biscuits using Parle Packager");
    }
}
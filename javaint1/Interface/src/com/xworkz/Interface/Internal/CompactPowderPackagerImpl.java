package com.xworkz.Interface.Internal;

public class CompactPowderPackagerImpl implements PowderPackager {
    public CompactPowderPackagerImpl() {
        System.out.println("No-arg constructor of CompactPowderPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing powder using Compact Powder Packager");
    }
}

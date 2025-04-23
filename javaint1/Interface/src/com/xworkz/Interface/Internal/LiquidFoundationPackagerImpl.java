package com.xworkz.Interface.Internal;

public class LiquidFoundationPackagerImpl implements FoundationPackager {
    public LiquidFoundationPackagerImpl() {
        System.out.println("No-arg constructor of LiquidFoundationPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing foundation using Liquid Foundation Packager");
    }
}

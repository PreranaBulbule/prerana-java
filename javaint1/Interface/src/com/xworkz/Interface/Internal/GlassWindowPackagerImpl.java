package com.xworkz.Interface.Internal;

public class GlassWindowPackagerImpl implements WindowPackager {
    public GlassWindowPackagerImpl() {
        System.out.println("No-arg constructor of GlassWindowPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing window using Glass Window Packager");
    }
}

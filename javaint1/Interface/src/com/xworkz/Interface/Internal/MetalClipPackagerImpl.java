package com.xworkz.Interface.Internal;

public class MetalClipPackagerImpl implements ClipPackager {
    public MetalClipPackagerImpl() {
        System.out.println("No-arg constructor of MetalClipPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing clip using Metal Clip Packager");
    }
}

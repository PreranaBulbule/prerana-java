package com.xworkz.Interface.Internal;

public class MatteLipstickPackagerImpl implements LipstickPackager {
    public MatteLipstickPackagerImpl() {
        System.out.println("No-arg constructor of MatteLipstickPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing lipstick using Matte Lipstick Packager");
    }
}

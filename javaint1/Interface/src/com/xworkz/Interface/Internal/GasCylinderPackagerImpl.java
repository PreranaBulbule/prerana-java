package com.xworkz.Interface.Internal;

public class GasCylinderPackagerImpl implements CylinderPackager {
    public GasCylinderPackagerImpl() {
        System.out.println("No-arg constructor of GasCylinderPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing cylinder using Gas Cylinder Packager");
    }
}

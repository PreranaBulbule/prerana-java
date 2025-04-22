package com.xworkz.Interface.Internal;

public class CeramicMugPackagerImpl implements MugPackager {
    public CeramicMugPackagerImpl() {
        System.out.println("No-arg constructor of CeramicMugPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing mug using Ceramic Mug Packager");
    }
}

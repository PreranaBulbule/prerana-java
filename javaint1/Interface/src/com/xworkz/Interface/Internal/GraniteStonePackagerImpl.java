package com.xworkz.Interface.Internal;

public class GraniteStonePackagerImpl implements StonePackager {
    public GraniteStonePackagerImpl() {
        System.out.println("No-arg constructor of GraniteStonePackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing stone using Granite Stone Packager");
    }
}

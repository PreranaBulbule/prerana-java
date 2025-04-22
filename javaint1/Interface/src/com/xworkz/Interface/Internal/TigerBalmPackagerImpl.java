package com.xworkz.Interface.Internal;

public class TigerBalmPackagerImpl implements BalmPackager {
    public TigerBalmPackagerImpl() {
        System.out.println("No-arg constructor of TigerBalmPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing balm using Tiger Balm Packager");
    }
}

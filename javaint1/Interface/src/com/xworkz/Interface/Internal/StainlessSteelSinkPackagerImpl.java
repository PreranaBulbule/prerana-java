package com.xworkz.Interface.Internal;

public class StainlessSteelSinkPackagerImpl implements SinkPackager {
    public StainlessSteelSinkPackagerImpl() {
        System.out.println("No-arg constructor of StainlessSteelSinkPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing sink using Stainless Steel Sink Packager");
    }
}

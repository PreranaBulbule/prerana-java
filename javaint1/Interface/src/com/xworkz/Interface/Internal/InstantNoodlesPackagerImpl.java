package com.xworkz.Interface.Internal;

public class InstantNoodlesPackagerImpl implements NoodlesPackager {
    public InstantNoodlesPackagerImpl() {
        System.out.println("No-arg constructor of InstantNoodlesPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing noodles using Instant Noodles Packager");
    }
}

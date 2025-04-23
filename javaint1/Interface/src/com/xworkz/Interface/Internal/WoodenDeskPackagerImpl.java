package com.xworkz.Interface.Internal;

public class WoodenDeskPackagerImpl implements DeskPackager {
    public WoodenDeskPackagerImpl() {
        System.out.println("No-arg constructor of WoodenDeskPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing desk using Wooden Desk Packager");
    }
}

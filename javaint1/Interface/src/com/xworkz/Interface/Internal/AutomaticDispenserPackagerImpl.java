package com.xworkz.Interface.Internal;

public class AutomaticDispenserPackagerImpl implements DispenserPackager {
    public AutomaticDispenserPackagerImpl() {
        System.out.println("No-arg constructor of AutomaticDispenserPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing dispenser using Automatic Dispenser Packager");
    }
}

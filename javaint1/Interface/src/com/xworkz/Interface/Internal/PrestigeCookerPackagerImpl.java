package com.xworkz.Interface.Internal;

public class PrestigeCookerPackagerImpl implements CookerPackager {
    public PrestigeCookerPackagerImpl() {
        System.out.println("No-arg constructor of PrestigeCookerPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing cooker using Prestige Cooker Packager");
    }
}

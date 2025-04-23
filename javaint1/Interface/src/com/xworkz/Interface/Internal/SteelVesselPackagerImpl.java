package com.xworkz.Interface.Internal;

public class SteelVesselPackagerImpl implements VesselPackager {
    public SteelVesselPackagerImpl() {
        System.out.println("No-arg constructor of SteelVesselPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing vessels using Steel Vessel Packager");
    }
}

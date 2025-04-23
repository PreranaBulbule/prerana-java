package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.VesselPackager;

public class Vessel {
    private VesselPackager packager;

    public Vessel(VesselPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the vessel packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Vessel packager not available");
        }
    }
}

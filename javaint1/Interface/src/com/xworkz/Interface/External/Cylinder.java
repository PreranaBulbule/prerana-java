package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.CylinderPackager;

public class Cylinder {
    private CylinderPackager packager;

    public Cylinder(CylinderPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the cylinder packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Cylinder packager not available");
        }
    }
}

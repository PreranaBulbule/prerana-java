package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.PlanePackager;

public class Airplane {
    private PlanePackager packager;

    public Airplane(PlanePackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the airplane packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Plane packager not available");
        }
    }
}

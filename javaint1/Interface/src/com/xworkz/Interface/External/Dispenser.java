package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.DispenserPackager;

public class Dispenser {
    private DispenserPackager packager;

    public Dispenser(DispenserPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the dispenser packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Dispenser packager not available");
        }
    }
}

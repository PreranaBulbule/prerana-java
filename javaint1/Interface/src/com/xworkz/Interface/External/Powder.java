package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.PowderPackager;

public class Powder {
    private PowderPackager packager;

    public Powder(PowderPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the powder packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Powder packager not available");
        }
    }
}

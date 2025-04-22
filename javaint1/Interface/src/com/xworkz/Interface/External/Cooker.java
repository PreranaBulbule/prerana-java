package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.CookerPackager;

public class Cooker {
    private CookerPackager packager;

    public Cooker(CookerPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the cooker packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Cooker packager not available");
        }
    }
}

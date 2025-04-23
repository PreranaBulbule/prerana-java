package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.FortunerPackager;

public class Fortuner {
    private FortunerPackager packager;

    public Fortuner(FortunerPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the Fortuner packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Fortuner packager not available");
        }
    }
}

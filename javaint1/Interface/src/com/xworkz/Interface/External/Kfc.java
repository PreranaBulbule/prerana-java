package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.KfcPackager;

public class Kfc {
    private KfcPackager packager;

    public Kfc(KfcPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the KFC packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("KFC packager not available");
        }
    }
}

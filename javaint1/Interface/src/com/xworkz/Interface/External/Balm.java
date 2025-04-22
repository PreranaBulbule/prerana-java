package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.BalmPackager;

public class Balm {
    private BalmPackager packager;

    public Balm(BalmPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the balm packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Balm packager not available");
        }
    }
}

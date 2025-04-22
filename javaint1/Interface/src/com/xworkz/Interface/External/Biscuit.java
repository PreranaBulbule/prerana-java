package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.BiscuitPackager;

public class Biscuit {
    private BiscuitPackager packager;

    public Biscuit(BiscuitPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the biscuit packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Packager not available");
        }
    }
}

package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.SaltPackager;

public class Salt {
    private SaltPackager packager;

    public Salt(SaltPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the salt packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Salt packager not available");
        }
    }
}

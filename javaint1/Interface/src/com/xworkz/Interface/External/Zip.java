package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.ZipPackager;

public class Zip {
    private ZipPackager packager;

    public Zip(ZipPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the zip packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Zip packager not available");
        }
    }
}

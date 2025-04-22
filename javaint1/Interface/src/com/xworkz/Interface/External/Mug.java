package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.MugPackager;

public class Mug {
    private MugPackager packager;

    public Mug(MugPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the mug packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Mug packager not available");
        }
    }
}

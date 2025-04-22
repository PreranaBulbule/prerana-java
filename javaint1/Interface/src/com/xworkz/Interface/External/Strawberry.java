package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.StrawberryPackager;

public class Strawberry {
    private StrawberryPackager packager;

    public Strawberry(StrawberryPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the strawberry packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Strawberry packager not available");
        }
    }
}

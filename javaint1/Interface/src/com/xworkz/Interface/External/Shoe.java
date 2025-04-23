package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.ShoePackager;

public class Shoe {
    private ShoePackager packager;

    public Shoe(ShoePackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the shoe packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Shoe packager not available");
        }
    }
}

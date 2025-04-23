package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.RingPackager;

public class Ring {
    private RingPackager packager;

    public Ring(RingPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the ring packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Ring packager not available");
        }
    }
}

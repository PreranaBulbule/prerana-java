package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.NexonPackager;

public class Nexon {
    private NexonPackager packager;

    public Nexon(NexonPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the Nexon packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Nexon packager not available");
        }
    }
}

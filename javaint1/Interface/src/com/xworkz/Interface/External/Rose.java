package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.RosePackager;

public class Rose {
    private RosePackager packager;

    public Rose(RosePackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the rose packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Rose packager not available");
        }
    }
}

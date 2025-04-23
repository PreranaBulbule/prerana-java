package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.MobilePackager;

public class Mobile {
    private MobilePackager packager;

    public Mobile(MobilePackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the mobile packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Mobile packager not available");
        }
    }
}

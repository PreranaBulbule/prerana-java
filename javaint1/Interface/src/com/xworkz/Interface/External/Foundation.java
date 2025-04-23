package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.FoundationPackager;

public class Foundation {
    private FoundationPackager packager;

    public Foundation(FoundationPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the foundation packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Foundation packager not available");
        }
    }
}

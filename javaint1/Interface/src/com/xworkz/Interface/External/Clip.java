package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.ClipPackager;

public class Clip {
    private ClipPackager packager;

    public Clip(ClipPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the clip packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Clip packager not available");
        }
    }
}

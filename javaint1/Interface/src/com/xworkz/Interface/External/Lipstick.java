package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.LipstickPackager;

public class Lipstick {
    private LipstickPackager packager;

    public Lipstick(LipstickPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the lipstick packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Lipstick packager not available");
        }
    }
}

package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.DusterPackager;

public class Duster {
    private DusterPackager packager;

    public Duster(DusterPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the duster packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Duster packager not available");
        }
    }
}

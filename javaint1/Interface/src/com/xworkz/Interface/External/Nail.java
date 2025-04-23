package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.NailPackager;

public class Nail {
    private NailPackager packager;

    public Nail(NailPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the nail packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Nail packager not available");
        }
    }
}

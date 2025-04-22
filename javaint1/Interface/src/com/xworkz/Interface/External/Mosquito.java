package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.MosquitoPackager;

public class Mosquito {
    private MosquitoPackager packager;

    public Mosquito(MosquitoPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the mosquito repellent packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Mosquito packager not available");
        }
    }
}

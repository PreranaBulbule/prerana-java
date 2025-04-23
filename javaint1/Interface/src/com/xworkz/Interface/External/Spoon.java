package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.SpoonPackager;

public class Spoon {
    private SpoonPackager packager;

    public Spoon(SpoonPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the spoon packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Spoon packager not available");
        }
    }
}

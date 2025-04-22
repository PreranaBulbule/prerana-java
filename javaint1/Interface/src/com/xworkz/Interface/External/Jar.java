package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.JarPackager;

public class Jar {
    private JarPackager packager;

    public Jar(JarPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the jar packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Jar packager not available");
        }
    }
}

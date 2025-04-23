package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.CinemaPackager;

public class Cinema {
    private CinemaPackager packager;

    public Cinema(CinemaPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the cinema packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Cinema packager not available");
        }
    }
}

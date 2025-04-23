package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.NoodlesPackager;

public class Noodles {
    private NoodlesPackager packager;

    public Noodles(NoodlesPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the noodles packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Noodles packager not available");
        }
    }
}

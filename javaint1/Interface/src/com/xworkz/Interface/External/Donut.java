package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.DonutPackager;

public class Donut {
    private DonutPackager packager;

    public Donut(DonutPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the donut packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Donut packager not available");
        }
    }
}

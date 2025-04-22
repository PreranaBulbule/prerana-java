package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.ChickenPackager;

public class Chicken {
    private ChickenPackager packager;

    public Chicken(ChickenPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the chicken packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Chicken packager not available");
        }
    }
}

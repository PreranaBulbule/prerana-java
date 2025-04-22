package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.TomatoPackager;

public class Tomato {
    private TomatoPackager packager;

    public Tomato(TomatoPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the tomato packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Tomato packager not available");
        }
    }
}

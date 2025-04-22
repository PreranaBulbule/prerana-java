package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.EggPackager;

public class Egg {
    private EggPackager packager;

    public Egg(EggPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the egg packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Egg packager not available");
        }
    }
}

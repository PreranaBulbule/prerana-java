package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.ChairPackager;

public class Chair {
    private ChairPackager packager;

    public Chair(ChairPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the chair packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Chair packager not available");
        }
    }
}

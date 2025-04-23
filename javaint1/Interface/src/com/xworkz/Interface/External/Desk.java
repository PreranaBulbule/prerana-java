package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.DeskPackager;

public class Desk {
    private DeskPackager packager;

    public Desk(DeskPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the desk packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Desk packager not available");
        }
    }
}

package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.DoorPackager;

public class Door {
    private DoorPackager packager;

    public Door(DoorPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the door packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Door packager not available");
        }
    }
}

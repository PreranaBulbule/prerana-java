package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.StonePackager;

public class Stone {
    private StonePackager packager;

    public Stone(StonePackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the stone packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Stone packager not available");
        }
    }
}

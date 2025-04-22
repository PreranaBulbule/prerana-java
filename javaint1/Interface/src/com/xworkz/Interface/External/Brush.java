package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.BrushPackager;

public class Brush {
    private BrushPackager packager;

    public Brush(BrushPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the brush packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Brush packager not available");
        }
    }
}

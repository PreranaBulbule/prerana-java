package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.WindowPackager;

public class Window {
    private WindowPackager packager;

    public Window(WindowPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the window packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Window packager not available");
        }
    }
}

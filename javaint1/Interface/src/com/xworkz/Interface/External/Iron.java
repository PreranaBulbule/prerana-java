package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.IronPackager;

public class Iron {
    private IronPackager packager;

    public Iron(IronPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the iron packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Iron packager not available");
        }
    }
}

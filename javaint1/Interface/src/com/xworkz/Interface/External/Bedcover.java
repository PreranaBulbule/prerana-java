package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.BedcoverPackager;

public class Bedcover {
    private BedcoverPackager packager;

    public Bedcover(BedcoverPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the bedcover packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Bedcover packager not available");
        }
    }
}

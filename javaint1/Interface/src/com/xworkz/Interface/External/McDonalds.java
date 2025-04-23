package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.McDonaldsPackager;

public class McDonalds {
    private McDonaldsPackager packager;

    public McDonalds(McDonaldsPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the McDonald's packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("McDonald's packager not available");
        }
    }
}

package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.SinkPackager;

public class Sink {
    private SinkPackager packager;

    public Sink(SinkPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the sink packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Sink packager not available");
        }
    }
}

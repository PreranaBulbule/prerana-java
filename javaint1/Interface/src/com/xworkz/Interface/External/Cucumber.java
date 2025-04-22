package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.CucumberPackager;

public class Cucumber {
    private CucumberPackager packager;

    public Cucumber(CucumberPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the cucumber packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Cucumber packager not available");
        }
    }
}

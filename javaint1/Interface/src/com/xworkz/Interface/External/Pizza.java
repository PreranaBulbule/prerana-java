package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.PizzaPackager;

public class Pizza {
    private PizzaPackager packager;

    public Pizza(PizzaPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the pizza packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Pizza packager not available");
        }
    }
}

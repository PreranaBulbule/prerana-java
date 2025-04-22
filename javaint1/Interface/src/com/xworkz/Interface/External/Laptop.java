package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.LaptopCharger;

public class Laptop {
    private LaptopCharger charger;

    public Laptop(LaptopCharger charger) {
        this.charger = charger;
    }

    public void startCharging() {
        System.out.println("Starting the laptop charging process");
        if (this.charger != null) {
            this.charger.charge();
        } else {
            System.out.println("Charger not connected");
        }
    }
}

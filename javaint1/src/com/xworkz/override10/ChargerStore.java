package com.xworkz.override10;

public class ChargerStore {
    public void manage(Charger charger) {
        charger.getBrand();
        charger.getType();
        charger.getCompatibility();
        charger.getPrice();
        charger.getVoltage();

        if (charger instanceof FastCharger) {
            System.out.println("Charger is instance of FastCharger");
            FastCharger fastCharger = (FastCharger) charger;
            fastCharger.getChargingSpeed();
        }
    }
}


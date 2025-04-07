package com.xworkz.Runner;
import com.xworkz.override10.Charger;
import com.xworkz.override10.ChargerStore;
import com.xworkz.override10.FastCharger;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger1 = new Charger();
        charger1.getBrand();
        charger1.getType();
        charger1.getCompatibility();
        charger1.getPrice();
        charger1.getVoltage();

        System.out.println("-------------------");
        Charger charger2 = new FastCharger();
        charger2.getBrand();
        charger2.getType();
        charger2.getCompatibility();
        charger2.getPrice();
        charger2.getVoltage();

        System.out.println("-----------------");
        FastCharger fastCharger = new FastCharger();
        fastCharger.getBrand();
        fastCharger.getType();
        fastCharger.getCompatibility();
        fastCharger.getPrice();
        fastCharger.getVoltage();
        fastCharger.getChargingSpeed();

        System.out.println("------------------");
        ChargerStore chargerStore = new ChargerStore();
        chargerStore.manage(charger2);
        chargerStore.manage(charger1);
        chargerStore.manage(fastCharger);
    }
}
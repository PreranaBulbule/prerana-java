package com.xworkz.override10;

public class FastCharger extends Charger {
    public FastCharger() {
        super();
        System.out.println("Running non-arg constructor FastCharger--child");
    }

    @Override
    public void getBrand() {
        System.out.println("FastCharger brand is Anker--child");
    }

    @Override
    public void getType() {
        System.out.println("FastCharger type is USB-C--child");
    }

    @Override
    public void getCompatibility() {
        System.out.println("FastCharger is compatible with Quick Charge and PD--child");
    }

    @Override
    public void getPrice() {
        System.out.println("FastCharger price is $25--child");
    }

    @Override
    public void getVoltage() {
        System.out.println("FastCharger voltage is 20V--child");
    }

    public void getChargingSpeed() {
        System.out.println("FastCharger charging speed is 45W--child only method");
    }
}
package com.xworkz.Interface.Internal;

public class HpLaptopChargerImpl implements LaptopCharger {
    public HpLaptopChargerImpl() {
        System.out.println("No-arg constructor of HpLaptopChargerImpl");
    }

    @Override
    public void charge() {
        System.out.println("Charging HP Laptop");
    }
}


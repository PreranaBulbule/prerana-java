package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Laptop;
import com.xworkz.Interface.Internal.HpLaptopChargerImpl;

public class LaptopRunner {
    public static void main(String[] args) {
        HpLaptopChargerImpl charger = new HpLaptopChargerImpl();
        Laptop laptop = new Laptop(charger);
        laptop.startCharging();
    }
}

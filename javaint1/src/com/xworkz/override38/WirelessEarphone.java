package com.xworkz.override38;

public class WirelessEarphone  extends Earphone {
    public WirelessEarphone() {
        super();
        System.out.println("Running non-arg constructor WirelessEarphone--child");
    }

    @Override
    public void getType() {
        System.out.println("Wireless earphone type--child");
    }

    @Override
    public void getSoundQuality() {
        System.out.println("Wireless earphone sound quality: High bass and clear treble--child");
    }

    @Override
    public void getBatteryLife() {
        System.out.println("Wireless earphone battery life: 10 hours--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Wireless earphone brand: XYZ--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Wireless earphone price: $50--child");
    }

    public void getConnectivity() {
        System.out.println("Wireless earphone connectivity: Bluetooth 5.0--child only method");
    }
}

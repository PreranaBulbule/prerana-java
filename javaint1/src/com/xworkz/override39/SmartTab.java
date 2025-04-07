package com.xworkz.override39;

public class SmartTab extends Tab {
    public SmartTab() {
        super();
        System.out.println("Running non-arg constructor SmartTab--child");
    }

    @Override
    public void getType() {
        System.out.println("Smart Tab type--child");
    }

    @Override
    public void getScreenSize() {
        System.out.println("Smart Tab screen size: 10 inches--child");
    }

    @Override
    public void getBatteryLife() {
        System.out.println("Smart Tab battery life: 12 hours--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Smart Tab brand: ABC Tech--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Smart Tab price: $300--child");
    }

    public void getConnectivity() {
        System.out.println("Smart Tab connectivity: 4G, WiFi--child only method");
    }
}
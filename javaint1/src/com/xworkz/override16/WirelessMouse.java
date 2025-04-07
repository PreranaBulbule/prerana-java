package com.xworkz.override16;

public class WirelessMouse extends Mouse {
    public WirelessMouse() {
        super();
        System.out.println("Running non-arg constructor WirelessMouse--child");
    }

    @Override
    public void getType() {
        System.out.println("Wireless mouse type--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Wireless mouse brand is Logitech--child");
    }

    @Override
    public void getColor() {
        System.out.println("Wireless mouse color is black--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Wireless mouse price is $30--child");
    }

    @Override
    public void getConnectivity() {
        System.out.println("Wireless mouse uses Bluetooth connectivity--child");
    }

    public void getBatteryLife() {
        System.out.println("Wireless mouse has a battery life of 6 months--child only method");
    }
}
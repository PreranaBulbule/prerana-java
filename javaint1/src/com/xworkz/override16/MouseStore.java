package com.xworkz.override16;

public class MouseStore
{
    public void manage(Mouse mouse) {
        mouse.getType();
        mouse.getBrand();
        mouse.getColor();
        mouse.getPrice();
        mouse.getConnectivity();

        if (mouse instanceof WirelessMouse) {
            System.out.println("Mouse is instance of WirelessMouse");
            WirelessMouse wirelessMouse = (WirelessMouse) mouse;
            wirelessMouse.getBatteryLife();
        }
    }
}


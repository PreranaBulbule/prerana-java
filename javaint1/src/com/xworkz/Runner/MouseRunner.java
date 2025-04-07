package com.xworkz.Runner;
import com.xworkz.override16.Mouse;
import com.xworkz.override16.MouseStore;
import com.xworkz.override16.WirelessMouse;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse();
        mouse1.getType();
        mouse1.getBrand();
        mouse1.getColor();
        mouse1.getPrice();
        mouse1.getConnectivity();

        System.out.println("-------------------");
        Mouse mouse2 = new WirelessMouse();
        mouse2.getType();
        mouse2.getBrand();
        mouse2.getColor();
        mouse2.getPrice();
        mouse2.getConnectivity();

        System.out.println("-----------------");
        WirelessMouse wirelessMouse = new WirelessMouse();
        wirelessMouse.getType();
        wirelessMouse.getBrand();
        wirelessMouse.getColor();
        wirelessMouse.getPrice();
        wirelessMouse.getConnectivity();
        wirelessMouse.getBatteryLife();

        System.out.println("------------------");
        MouseStore mouseStore = new MouseStore();
        mouseStore.manage(mouse2);
        mouseStore.manage(mouse1);
        mouseStore.manage(wirelessMouse);
    }
}

package com.xworkz.override39;

public class TabStore {
    public void manage(Tab tab) {
        tab.getType();
        tab.getScreenSize();
        tab.getBatteryLife();
        tab.getBrand();
        tab.getPrice();

        if (tab instanceof SmartTab) {
            System.out.println("Tab is instance of SmartTab");
            SmartTab smartTab = (SmartTab) tab;
            smartTab.getConnectivity();
        }
    }

}

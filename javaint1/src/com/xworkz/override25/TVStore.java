package com.xworkz.override25;

public class TVStore {
    public void manage(TV tv) {
        tv.getBrand();
        tv.getSize();
        tv.getType();
        tv.getPrice();
        tv.getResolution();

        if (tv instanceof SmartTV) {
            System.out.println("TV is instance of SmartTV");
            SmartTV smartTV = (SmartTV) tv;
            smartTV.getSmartFeatures();
        }
    }
}


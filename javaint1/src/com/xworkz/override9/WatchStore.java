package com.xworkz.override9;

public class WatchStore {
    public void manage(Watch watch) {
        watch.getBrand();
        watch.getType();
        watch.getMaterial();
        watch.getPrice();
        watch.getBatteryLife();

        if (watch instanceof Smartwatch) {
            System.out.println("Watch is instance of Smartwatch");
            Smartwatch smartwatch = (Smartwatch) watch;
            smartwatch.getFeatures();
        }
    }
}


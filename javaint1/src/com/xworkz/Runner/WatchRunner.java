package com.xworkz.Runner;
import com.xworkz.override9.Watch;
import com.xworkz.override9.WatchStore;
import com.xworkz.override9.Smartwatch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch1 = new Watch();
        watch1.getBrand();
        watch1.getType();
        watch1.getMaterial();
        watch1.getPrice();
        watch1.getBatteryLife();

        System.out.println("-------------------");
        Watch watch2 = new Smartwatch();
        watch2.getBrand();
        watch2.getType();
        watch2.getMaterial();
        watch2.getPrice();
        watch2.getBatteryLife();

        System.out.println("-----------------");
        Smartwatch smartwatch = new Smartwatch();
        smartwatch.getBrand();
        smartwatch.getType();
        smartwatch.getMaterial();
        smartwatch.getPrice();
        smartwatch.getBatteryLife();
        smartwatch.getFeatures();

        System.out.println("------------------");
        WatchStore watchStore = new WatchStore();
        watchStore.manage(watch2);
        watchStore.manage(watch1);
        watchStore.manage(smartwatch);
    }
}

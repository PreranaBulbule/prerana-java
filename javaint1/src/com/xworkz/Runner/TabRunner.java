package com.xworkz.Runner;
import com.xworkz.override39.Tab;
import com.xworkz.override39.SmartTab;
import com.xworkz.override39.TabStore;

public class TabRunner {
    public static void main(String[] args) {
        Tab tab1 = new Tab();
        tab1.getType();
        tab1.getScreenSize();
        tab1.getBatteryLife();
        tab1.getBrand();
        tab1.getPrice();

        System.out.println("-------------------");
        Tab tab2 = new SmartTab();
        tab2.getType();
        tab2.getScreenSize();
        tab2.getBatteryLife();
        tab2.getBrand();
        tab2.getPrice();

        System.out.println("-----------------");
        SmartTab smartTab = new SmartTab();
        smartTab.getType();
        smartTab.getScreenSize();
        smartTab.getBatteryLife();
        smartTab.getBrand();
        smartTab.getPrice();
        smartTab.getConnectivity();

        System.out.println("------------------");
        TabStore tabStore = new TabStore();
        tabStore.manage(tab2);
        tabStore.manage(tab1);
        tabStore.manage(smartTab);
    }
}

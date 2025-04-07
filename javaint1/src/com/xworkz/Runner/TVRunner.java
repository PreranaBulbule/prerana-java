package com.xworkz.Runner;
import com.xworkz.override25.TV;
import com.xworkz.override25.TVStore;
import com.xworkz.override25.SmartTV;

public class TVRunner {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.getBrand();
        tv1.getSize();
        tv1.getType();
        tv1.getPrice();
        tv1.getResolution();

        System.out.println("-------------------");
        TV tv2 = new SmartTV();
        tv2.getBrand();
        tv2.getSize();
        tv2.getType();
        tv2.getPrice();
        tv2.getResolution();

        System.out.println("-----------------");
        SmartTV smartTV = new SmartTV();
        smartTV.getBrand();
        smartTV.getSize();
        smartTV.getType();
        smartTV.getPrice();
        smartTV.getResolution();
        smartTV.getSmartFeatures();

        System.out.println("------------------");
        TVStore tvStore = new TVStore();
        tvStore.manage(tv2);
        tvStore.manage(tv1);
        tvStore.manage(smartTV);
    }
}

package com.xworkz.Runner;
import com.xworkz.override38.Earphone;
import com.xworkz.override38.WirelessEarphone;
import com.xworkz.override38.EarphoneStore;

public class EarphoneRunner {
    public static void main(String[] args) {
        Earphone earphone1 = new Earphone();
        earphone1.getType();
        earphone1.getSoundQuality();
        earphone1.getBatteryLife();
        earphone1.getBrand();
        earphone1.getPrice();

        System.out.println("-------------------");
        Earphone earphone2 = new WirelessEarphone();
        earphone2.getType();
        earphone2.getSoundQuality();
        earphone2.getBatteryLife();
        earphone2.getBrand();
        earphone2.getPrice();

        System.out.println("-----------------");
        WirelessEarphone wirelessEarphone = new WirelessEarphone();
        wirelessEarphone.getType();
        wirelessEarphone.getSoundQuality();
        wirelessEarphone.getBatteryLife();
        wirelessEarphone.getBrand();
        wirelessEarphone.getPrice();
        wirelessEarphone.getConnectivity();

        System.out.println("------------------");
        EarphoneStore earphoneStore = new EarphoneStore();
        earphoneStore.manage(earphone2);
        earphoneStore.manage(earphone1);
        earphoneStore.manage(wirelessEarphone);
    }
}

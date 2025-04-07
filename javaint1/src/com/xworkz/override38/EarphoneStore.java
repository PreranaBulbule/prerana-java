package com.xworkz.override38;

public class EarphoneStore {
    public void manage(Earphone earphone) {
        earphone.getType();
        earphone.getSoundQuality();
        earphone.getBatteryLife();
        earphone.getBrand();
        earphone.getPrice();

        if (earphone instanceof WirelessEarphone) {
            System.out.println("Earphone is instance of WirelessEarphone");
            WirelessEarphone wirelessEarphone = (WirelessEarphone) earphone;
            wirelessEarphone.getConnectivity();
        }
    }
}

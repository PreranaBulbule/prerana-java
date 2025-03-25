package com.xworkz.Satellite;

public class SatelliteArray {
    public void showSatellites() {
        Satellite s1 = new Satellite();
        s1.setType(SatelliteType.COMMUNICATION);
        s1.setCost(200);
        s1.setWeight(5000);
        s1.setLoadCapacity(1000);

        Satellite s2 = new Satellite();
        s2.setType(SatelliteType.WEATHER);
        s2.setCost(150);
        s2.setWeight(3000);
        s2.setLoadCapacity(800);

        s1.displayDetails();
        s2.displayDetails();
    }
}


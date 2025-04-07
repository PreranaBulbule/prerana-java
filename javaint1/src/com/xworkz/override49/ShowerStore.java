package com.xworkz.override49;

public class ShowerStore {
    public void manage(Shower shower) {
        shower.getMaterial();
        shower.getSize();
        shower.getWeight();
        shower.getColor();
        shower.getFunction();

        if (shower instanceof LuxuryShower) {
            System.out.println("Shower is an instance of LuxuryShower");
            LuxuryShower luxuryShower = (LuxuryShower) shower;
            luxuryShower.getWaterPressure();
        }
    }

}

package com.xworkz.override47;

public class PerfumeStore {
    public void manage(Perfume perfume) {
        perfume.getBrand();
        perfume.getFragrance();
        perfume.getSize();
        perfume.getPrice();
        perfume.getBottleType();

        if (perfume instanceof LuxuryPerfume) {
            System.out.println("Perfume is an instance of LuxuryPerfume");
            LuxuryPerfume luxuryPerfume = (LuxuryPerfume) perfume;
            luxuryPerfume.getExclusivity();
        }
    }

}

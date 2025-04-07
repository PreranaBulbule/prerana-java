package com.xworkz.Runner;
import com.xworkz.override47.Perfume;
import com.xworkz.override47.LuxuryPerfume;
import com.xworkz.override47.PerfumeStore;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume1 = new Perfume();
        perfume1.getBrand();
        perfume1.getFragrance();
        perfume1.getSize();
        perfume1.getPrice();
        perfume1.getBottleType();

        System.out.println("-------------------");
        Perfume perfume2 = new LuxuryPerfume();
        perfume2.getBrand();
        perfume2.getFragrance();
        perfume2.getSize();
        perfume2.getPrice();
        perfume2.getBottleType();

        System.out.println("-----------------");
        LuxuryPerfume luxuryPerfume = new LuxuryPerfume();
        luxuryPerfume.getBrand();
        luxuryPerfume.getFragrance();
        luxuryPerfume.getSize();
        luxuryPerfume.getPrice();
        luxuryPerfume.getBottleType();
        luxuryPerfume.getExclusivity();

        System.out.println("------------------");
        PerfumeStore perfumeStore = new PerfumeStore();
        perfumeStore.manage(perfume2);
        perfumeStore.manage(perfume1);
        perfumeStore.manage(luxuryPerfume);
    }
}

package com.xworkz.Runner;
import com.xworkz.override35.Powder;
import com.xworkz.override35.FacePowder;
import com.xworkz.override35.PowderStore;

public class PowderRunner {
    public static void main(String[] args) {
        Powder powder1 = new Powder();
        powder1.getType();
        powder1.getColor();
        powder1.getWeight();
        powder1.getUsage();
        powder1.getPrice();

        System.out.println("-------------------");
        Powder powder2 = new FacePowder();
        powder2.getType();
        powder2.getColor();
        powder2.getWeight();
        powder2.getUsage();
        powder2.getPrice();

        System.out.println("-----------------");
        FacePowder facePowder = new FacePowder();
        facePowder.getType();
        facePowder.getColor();
        facePowder.getWeight();
        facePowder.getUsage();
        facePowder.getPrice();
        facePowder.getBrand();

        System.out.println("------------------");
        PowderStore powderStore = new PowderStore();
        powderStore.manage(powder2);
        powderStore.manage(powder1);
        powderStore.manage(facePowder);
    }
}

package com.xworkz.override35;

public class PowderStore {
    public void manage(Powder powder) {
        powder.getType();
        powder.getColor();
        powder.getWeight();
        powder.getUsage();
        powder.getPrice();

        if (powder instanceof FacePowder) {
            System.out.println("Powder is instance of FacePowder");
            FacePowder facePowder = (FacePowder) powder;
            facePowder.getBrand();
        }
    }

}

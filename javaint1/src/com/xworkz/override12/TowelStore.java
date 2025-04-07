package com.xworkz.override12;

public class TowelStore {
    public void manage(Towel towel) {
        towel.getMaterial();
        towel.getSize();
        towel.getColor();
        towel.getPrice();
        towel.getWeight();

        if (towel instanceof BeachTowel) {
            System.out.println("Towel is instance of BeachTowel");
            BeachTowel beachTowel = (BeachTowel) towel;
            beachTowel.getDesign();
        }
    }
}


package com.xworkz.override13;

public class NailStore {
    public void manage(Nail nail) {
        nail.getMaterial();
        nail.getSize();
        nail.getColor();
        nail.getPrice();
        nail.getWeight();

        if (nail instanceof SteelNail) {
            System.out.println("Nail is instance of SteelNail");
            SteelNail steelNail = (SteelNail) nail;
            steelNail.getDurability();
        }
    }
}


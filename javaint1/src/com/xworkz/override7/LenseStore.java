package com.xworkz.override7;

public class LenseStore {
    public void manage(Lense lense) {
        lense.getType();
        lense.getColor();
        lense.getSize();
        lense.getMaterial();
        lense.getPrice();

        if(lense instanceof ContactLense) {
            System.out.println("Lense is instance of ContactLense");
            ContactLense contactLense = (ContactLense) lense;
            contactLense.getUVProtection();
        }
    }
}


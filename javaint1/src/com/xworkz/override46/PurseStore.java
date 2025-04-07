package com.xworkz.override46;

public class PurseStore {
    public void manage(Purse purse) {
        purse.getMaterial();
        purse.getColor();
        purse.getSize();
        purse.getDesign();
        purse.getClosureType();

        if (purse instanceof LeatherPurse) {
            System.out.println("Purse is instance of LeatherPurse");
            LeatherPurse leatherPurse = (LeatherPurse) purse;
            leatherPurse.getDurability();
        }
    }

}

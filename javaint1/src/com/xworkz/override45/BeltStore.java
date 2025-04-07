package com.xworkz.override45;

public class BeltStore {
    public void manage(Belt belt) {
        belt.getMaterial();
        belt.getColor();
        belt.getSize();
        belt.getBuckleType();
        belt.getStyle();

        if (belt instanceof LeatherBelt) {
            System.out.println("Belt is instance of LeatherBelt");
            LeatherBelt leatherBelt = (LeatherBelt) belt;
            leatherBelt.getDurability();
        }
    }

}

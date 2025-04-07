package com.xworkz.override48;

public class KeybunchStore {
    public void manage(Keybunch keybunch) {
        keybunch.getMaterial();
        keybunch.getSize();
        keybunch.getWeight();
        keybunch.getColor();
        keybunch.getPurpose();

        if (keybunch instanceof LuxuryKeybunch) {
            System.out.println("Keybunch is an instance of LuxuryKeybunch");
            LuxuryKeybunch luxuryKeybunch = (LuxuryKeybunch) keybunch;
            luxuryKeybunch.getExclusivity();
        }
    }

}

package com.xworkz.Runner;
import com.xworkz.override48.Keybunch;
import com.xworkz.override48.LuxuryKeybunch;
import com.xworkz.override48.KeybunchStore;

public class KeybunchRunner {
    public static void main(String[] args) {
        Keybunch keybunch1 = new Keybunch();
        keybunch1.getMaterial();
        keybunch1.getSize();
        keybunch1.getWeight();
        keybunch1.getColor();
        keybunch1.getPurpose();

        System.out.println("-------------------");
        Keybunch keybunch2 = new LuxuryKeybunch();
        keybunch2.getMaterial();
        keybunch2.getSize();
        keybunch2.getWeight();
        keybunch2.getColor();
        keybunch2.getPurpose();

        System.out.println("-----------------");
        LuxuryKeybunch luxuryKeybunch = new LuxuryKeybunch();
        luxuryKeybunch.getMaterial();
        luxuryKeybunch.getSize();
        luxuryKeybunch.getWeight();
        luxuryKeybunch.getColor();
        luxuryKeybunch.getPurpose();
        luxuryKeybunch.getExclusivity();

        System.out.println("------------------");
        KeybunchStore keybunchStore = new KeybunchStore();
        keybunchStore.manage(keybunch2);
        keybunchStore.manage(keybunch1);
        keybunchStore.manage(luxuryKeybunch);
    }
}

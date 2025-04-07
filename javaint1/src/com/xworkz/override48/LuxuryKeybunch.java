package com.xworkz.override48;

public class LuxuryKeybunch extends Keybunch {
    public LuxuryKeybunch() {
        super();
        System.out.println("Running non-arg constructor LuxuryKeybunch--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Luxury Keybunch is made of high-end metal like titanium--child");
    }

    @Override
    public void getSize() {
        System.out.println("Luxury Keybunch size is compact and stylish--child");
    }

    @Override
    public void getWeight() {
        System.out.println("Luxury Keybunch is very light due to premium material--child");
    }

    @Override
    public void getColor() {
        System.out.println("Luxury Keybunch color is gold, silver, or premium shades--child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Luxury Keybunch is used to hold keys and make a style statement--child");
    }

    public void getExclusivity() {
        System.out.println("Luxury Keybunch is exclusive and designed by top designers--child only method");
    }
}
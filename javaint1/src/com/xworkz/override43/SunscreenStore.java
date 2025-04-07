package com.xworkz.override43;

public class SunscreenStore {
    public void manage(Sunscreen sunscreen) {
        sunscreen.getType();
        sunscreen.getSPF();
        sunscreen.getTexture();
        sunscreen.getIngredients();
        sunscreen.getFragrance();

        if (sunscreen instanceof WaterResistantSunscreen) {
            System.out.println("Sunscreen is instance of WaterResistantSunscreen");
            WaterResistantSunscreen waterResistantSunscreen = (WaterResistantSunscreen) sunscreen;
            waterResistantSunscreen.getSweatProtection();
        }
    }

}

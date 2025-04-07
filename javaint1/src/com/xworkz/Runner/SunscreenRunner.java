package com.xworkz.Runner;
import com.xworkz.override43.Sunscreen;
import com.xworkz.override43.WaterResistantSunscreen;
import com.xworkz.override43.SunscreenStore;

public class SunscreenRunner {
    public static void main(String[] args) {
        Sunscreen sunscreen1 = new Sunscreen();
        sunscreen1.getType();
        sunscreen1.getSPF();
        sunscreen1.getTexture();
        sunscreen1.getIngredients();
        sunscreen1.getFragrance();

        System.out.println("-------------------");
        Sunscreen sunscreen2 = new WaterResistantSunscreen();
        sunscreen2.getType();
        sunscreen2.getSPF();
        sunscreen2.getTexture();
        sunscreen2.getIngredients();
        sunscreen2.getFragrance();

        System.out.println("-----------------");
        WaterResistantSunscreen waterResistantSunscreen = new WaterResistantSunscreen();
        waterResistantSunscreen.getType();
        waterResistantSunscreen.getSPF();
        waterResistantSunscreen.getTexture();
        waterResistantSunscreen.getIngredients();
        waterResistantSunscreen.getFragrance();
        waterResistantSunscreen.getSweatProtection();

        System.out.println("------------------");
        SunscreenStore sunscreenStore = new SunscreenStore();
        sunscreenStore.manage(sunscreen2);
        sunscreenStore.manage(sunscreen1);
        sunscreenStore.manage(waterResistantSunscreen);
    }
}

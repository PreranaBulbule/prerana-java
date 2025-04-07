package com.xworkz.override43;

public class WaterResistantSunscreen extends Sunscreen {
    public WaterResistantSunscreen() {
        super();
        System.out.println("Running non-arg constructor WaterResistantSunscreen--child");
    }

    @Override
    public void getType() {
        System.out.println("Water-resistant sunscreen provides extra protection during sweating or swimming--child");
    }

    @Override
    public void getSPF() {
        System.out.println("Water-resistant sunscreen typically has an SPF of 30-50--child");
    }

    @Override
    public void getTexture() {
        System.out.println("Water-resistant sunscreen has a thicker, more durable texture--child");
    }

    @Override
    public void getIngredients() {
        System.out.println("Water-resistant sunscreen contains ingredients that stay effective in water--child");
    }

    @Override
    public void getFragrance() {
        System.out.println("Water-resistant sunscreen may have a stronger fragrance or be unscented--child");
    }

    public void getSweatProtection() {
        System.out.println("Water-resistant sunscreen is designed to protect against sweat and water exposure--child only method");
    }
}
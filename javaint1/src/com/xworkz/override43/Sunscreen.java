package com.xworkz.override43;

public class Sunscreen {
    public Sunscreen() {
        System.out.println("Running non-arg constructor Sunscreen--parent");
    }

    public void getType() {
        System.out.println("Sunscreen is used to protect the skin from UV rays--parent");
    }

    public void getSPF() {
        System.out.println("Sunscreen SPF varies, typically from 15 to 50--parent");
    }

    public void getTexture() {
        System.out.println("Sunscreen has a creamy or lotion-like texture--parent");
    }

    public void getIngredients() {
        System.out.println("Sunscreen contains active ingredients like oxybenzone, avobenzone, etc.--parent");
    }

    public void getFragrance() {
        System.out.println("Sunscreen may have a light fragrance or be fragrance-free--parent");
    }
}

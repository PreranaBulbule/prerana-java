package com.xworkz.casting.Internal;

public class Bottle {
    private String material;
    private double volume;
    private double price;

    public Bottle() {
        System.out.println("Running no-arg constructor of Bottle");
        this.material = "Plastic";
        this.volume = 1.0;
        this.price = 50.00;
    }

    public Bottle(String material, double volume, double price) {
        this.material = material;
        this.volume = volume;
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Volume: " + volume + "L, Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BottleHashCode (from super): " + super.hashCode());
        return 666;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bottle) {
                System.out.println("have ref. will compare..");
                Bottle bottle1 = this;
                Bottle bottle2 = (Bottle) obj;
                if (bottle1.material.equals(bottle2.material)) {
                    System.out.println("both are same material");
                    return true;
                }
            }
        }
        return false;
    }
}

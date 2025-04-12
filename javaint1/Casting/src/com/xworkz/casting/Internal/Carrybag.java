package com.xworkz.casting.Internal;

public class Carrybag {
    private String material;
    private String color;
    private double price;

    public Carrybag() {
        System.out.println("Running no-arg constructor of Carrybag");
        this.material = "Plastic";
        this.color = "White";
        this.price = 2.00;
    }

    public Carrybag(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Color: " + color + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("CarrybagHashCode (from super): " + super.hashCode());
        return 6666; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Carrybag) {
                System.out.println("have ref. will compare..");
                Carrybag bag1 = this;
                Carrybag bag2 = (Carrybag) obj;
                if (bag1.material.equals(bag2.material)) {
                    System.out.println("both are same material");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Belt {
    private String material;
    private String color;
    private double price;

    public Belt() {
        System.out.println("Running no-arg constructor of Belt");
        this.material = "Fabric";
        this.color = "Black";
        this.price = 9.99;
    }

    public Belt(String material, String color, double price) {
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
        System.out.println("BeltHashCode (from super): " + super.hashCode());
        return 444;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Belt) {
                System.out.println("have ref. will compare..");
                Belt belt1 = this;
                Belt belt2 = (Belt) obj;
                if (belt1.material.equals(belt2.material)) {
                    System.out.println("both are same material");
                    return true;
                }
            }
        }
        return false;
    }
}

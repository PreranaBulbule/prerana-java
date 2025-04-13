package com.xworkz.casting.Internal;

public class Clip {
    private String brand;
    private String color;
    private double price;

    public Clip() {
        System.out.println("Running no-arg constructor of Clip");
        this.brand = "Generic";
        this.color = "Black";
        this.price = 5.00;
    }

    public Clip(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Color: " + color + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("ClipHashCode (from super): " + super.hashCode());
        return 1414; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Clip) {
                System.out.println("have ref. will compare..");
                Clip c1 = this;
                Clip c2 = (Clip) obj;
                if (c1.brand.equals(c2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Brush {
    private String brand;
    private String type;
    private double price;

    public Brush() {
        System.out.println("Running no-arg constructor of Brush");
        this.brand = "Oral-B";
        this.type = "Toothbrush";
        this.price = 3.99;
    }

    public Brush(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BrushHashCode (from super): " + super.hashCode());
        return 888;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Brush) {
                System.out.println("have ref. will compare..");
                Brush brush1 = this;
                Brush brush2 = (Brush) obj;
                if (brush1.brand.equals(brush2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Sharpener {
    private String brand;
    private String color;
    private double price;

    public Sharpener(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sharpener [brand=" + brand + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("SharpenerHashCode (from super): " + super.hashCode());
        return 4300;
    }
}

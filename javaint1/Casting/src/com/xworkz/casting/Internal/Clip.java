package com.xworkz.casting.Internal;

public class Clip {
    private String brand;
    private String color;
    private double price;

    public Clip(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clip [brand=" + brand + ", color=" + color + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("ClipHashCode (from super): " + super.hashCode());
        return 1100;
    }

}

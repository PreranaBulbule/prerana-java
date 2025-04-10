package com.xworkz.casting.Internal;

public class Brush {
    private String brand;
    private String type;
    private double price;

    public Brush(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brush [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BrushHashCode (from super): " + super.hashCode());
        return 777;
    }
}

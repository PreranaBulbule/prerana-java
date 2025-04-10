package com.xworkz.casting.Internal;

public class Zip {
    private String brand;
    private String color;
    private double price;

    public Zip(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Zip [brand=" + brand + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("ZipHashCode (from super): " + super.hashCode());
        return 6900;
    }
}

package com.xworkz.casting.Internal;

public class Lipstick {
    private String brand;
    private String shade;
    private double price;

    public Lipstick(String brand, String shade, double price) {
        this.brand = brand;
        this.shade = shade;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lipstick [brand=" + brand + ", shade=" + shade + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("LipstickHashCode (from super): " + super.hashCode());
        return 1800;
    }
}

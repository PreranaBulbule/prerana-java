package com.xworkz.casting.Internal;

public class Specs {
    private String brand;
    private String frameMaterial;
    private double price;

    public Specs(String brand, String frameMaterial, double price) {
        this.brand = brand;
        this.frameMaterial = frameMaterial;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Specs [brand=" + brand + ", frameMaterial=" + frameMaterial + ", price=" + price + "]";
    }
}

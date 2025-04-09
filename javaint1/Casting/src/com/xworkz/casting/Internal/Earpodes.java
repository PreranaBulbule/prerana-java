package com.xworkz.casting.Internal;

public class Earpodes {
    private String brand;
    private String type;
    private double price;

    public Earpodes(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Earpodes [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}

package com.xworkz.casting.Internal;

public class Moisturizer {
    private String brand;
    private String type;
    private double price;

    public Moisturizer(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Moisturizer [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}

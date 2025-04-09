package com.xworkz.casting.Internal;

public class Soap {
    private String brand;
    private String type;
    private double price;

    public Soap(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Soap [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}

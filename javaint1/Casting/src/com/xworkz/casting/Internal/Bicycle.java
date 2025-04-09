package com.xworkz.casting.Internal;

public class Bicycle {
    private String brand;
    private String type;
    private double price;

    public Bicycle(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bicycle [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}

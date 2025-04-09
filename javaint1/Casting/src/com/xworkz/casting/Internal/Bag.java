package com.xworkz.casting.Internal;

public class Bag {
    private String brand;
    private String type;
    private double price;

    public Bag(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }

}

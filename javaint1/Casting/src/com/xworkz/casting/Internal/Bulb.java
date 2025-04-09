package com.xworkz.casting.Internal;

public class Bulb {
    private String brand;
    private String type;
    private double price;

    public Bulb(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bulb [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}

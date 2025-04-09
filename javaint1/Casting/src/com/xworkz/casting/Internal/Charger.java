package com.xworkz.casting.Internal;

public class Charger {
    private String brand;
    private String type;
    private double price;

    public Charger(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Charger [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}

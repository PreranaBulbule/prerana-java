package com.xworkz.casting.Internal;

public class Tubelight {
    private String brand;
    private String type;
    private double price;

    public Tubelight(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tubelight [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}

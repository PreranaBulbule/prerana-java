package com.xworkz.casting.Internal;

public class WashingMachine {
    private String brand;
    private String type;
    private double price;

    public WashingMachine(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "WashingMachine [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}

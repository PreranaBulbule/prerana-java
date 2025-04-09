package com.xworkz.casting.Internal;

public class Shoe {
    private String brand;
    private String type;
    private double price;

    public Shoe(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoe [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }

}

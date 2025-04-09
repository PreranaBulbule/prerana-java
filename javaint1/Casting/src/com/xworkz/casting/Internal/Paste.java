package com.xworkz.casting.Internal;

public class Paste {
    private String brand;
    private String type;
    private double price;

    public Paste(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paste [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }

}

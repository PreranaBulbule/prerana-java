package com.xworkz.casting.Internal;

public class Zip {
    private String brand;
    private String color;
    private double price;

    public Zip(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Zip [brand=" + brand + ", color=" + color + ", price=" + price + "]";
    }

}

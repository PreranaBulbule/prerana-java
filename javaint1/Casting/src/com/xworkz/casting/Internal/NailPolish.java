package com.xworkz.casting.Internal;

public class NailPolish {
    private String brand;
    private String color;
    private double price;

    public NailPolish(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "NailPolish [brand=" + brand + ", color=" + color + ", price=" + price + "]";
    }
}

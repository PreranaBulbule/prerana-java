package com.xworkz.casting.Internal;

public class Paint {
    private String brand;
    private String color;
    private double price;

    public Paint(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paint [brand=" + brand + ", color=" + color + ", price=" + price + "]";
    }

}

package com.xworkz.casting.Internal;

public class Jeans {
    private String brand;
    private String size;
    private double price;

    public Jeans(String brand, String size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jeans [brand=" + brand + ", size=" + size + ", price=" + price + "]";
    }
}

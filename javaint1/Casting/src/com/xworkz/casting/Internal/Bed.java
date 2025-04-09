package com.xworkz.casting.Internal;

public class Bed {
    private String brand;
    private String size;
    private double price;

    public Bed(String brand, String size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bed [brand=" + brand + ", size=" + size + ", price=" + price + "]";
    }
}

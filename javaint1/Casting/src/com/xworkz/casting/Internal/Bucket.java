package com.xworkz.casting.Internal;

public class Bucket {
    private String material;
    private double capacity;
    private double price;

    public Bucket(String material, double capacity, double price) {
        this.material = material;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bucket [material=" + material + ", capacity=" + capacity + " liters, price=" + price + "]";
    }
}

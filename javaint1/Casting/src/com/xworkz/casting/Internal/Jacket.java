package com.xworkz.casting.Internal;

public class Jacket {
    private String brand;
    private String material;
    private double price;

    public Jacket(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jacket [brand=" + brand + ", material=" + material + ", price=" + price + "]";
    }
}

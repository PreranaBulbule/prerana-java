package com.xworkz.casting.Internal;

public class Pillow {
    private String brand;
    private String material;
    private double price;

    public Pillow(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pillow [brand=" + brand + ", material=" + material + ", price=" + price + "]";
    }

}

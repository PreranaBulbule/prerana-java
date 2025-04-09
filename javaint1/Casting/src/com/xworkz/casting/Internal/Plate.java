package com.xworkz.casting.Internal;

public class Plate {
    private String material;
    private String size;
    private double price;

    public Plate(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plate [material=" + material + ", size=" + size + ", price=" + price + "]";
    }
}

package com.xworkz.casting.Internal;

public class Wire {
    private String material;
    private double length;
    private double price;

    public Wire(String material, double length, double price) {
        this.material = material;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wire [material=" + material + ", length=" + length + " meters, price=" + price + "]";
    }
}

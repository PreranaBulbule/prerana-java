package com.xworkz.casting.Internal;

public class Ring {
    private String material;
    private String size;
    private double price;

    public Ring(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ring [material=" + material + ", size=" + size + ", price=" + price + "]";
    }
}

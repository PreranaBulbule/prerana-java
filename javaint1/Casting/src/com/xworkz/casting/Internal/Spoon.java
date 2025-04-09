package com.xworkz.casting.Internal;

public class Spoon {
    private String material;
    private String size;
    private double price;

    public Spoon(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Spoon [material=" + material + ", size=" + size + ", price=" + price + "]";
    }
}

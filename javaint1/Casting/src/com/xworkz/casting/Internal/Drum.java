package com.xworkz.casting.Internal;

public class Drum {
    private String material;
    private double size;
    private double price;

    public Drum(String material, double size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drum [material=" + material + ", size=" + size + " inches, price=" + price + "]";
    }

}

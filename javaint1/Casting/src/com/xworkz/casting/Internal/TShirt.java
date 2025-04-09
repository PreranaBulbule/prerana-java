package com.xworkz.casting.Internal;

public class TShirt {
    private String brand;
    private String size;
    private double price;

    public TShirt(String brand, String size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TShirt [brand=" + brand + ", size=" + size + ", price=" + price + "]";
    }
}

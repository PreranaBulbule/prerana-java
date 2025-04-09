package com.xworkz.casting.Internal;

public class Pizza {
    private String flavor;
    private String size;
    private double price;

    public Pizza(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza [flavor=" + flavor + ", size=" + size + ", price=" + price + "]";
    }
}

package com.xworkz.casting.Internal;

public class Tab {
    private String brand;
    private String model;
    private double price;

    public Tab(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tab [brand=" + brand + ", model=" + model + ", price=" + price + "]";
    }

}

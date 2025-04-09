package com.xworkz.casting.Internal;

public class Calculator {
    private String brand;
    private String model;
    private double price;

    public Calculator(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Calculator [brand=" + brand + ", model=" + model + ", price=" + price + "]";
    }
}

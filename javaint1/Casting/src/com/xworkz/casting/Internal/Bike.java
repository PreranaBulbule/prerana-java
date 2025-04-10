package com.xworkz.casting.Internal;

public class Bike {
    private String model;
    private String color;
    private double price;

    public Bike(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike [model=" + model + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BikeHashCode (from super): " + super.hashCode());
        return 111;
    }
}

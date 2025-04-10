package com.xworkz.casting.Internal;

public class Display {
    private String brand;
    private String type;
    private double price;

    public Display(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Display [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("DisplayHashCode (from super): " + super.hashCode());
        return 1500;
    }
}

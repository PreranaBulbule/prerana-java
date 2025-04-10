package com.xworkz.casting.Internal;

public class Hat {
    private String brand;
    private String color;
    private double price;

    public Hat(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hat [brand=" + brand + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("HatHashCode (from super): " + super.hashCode());
        return 2000;
    }
}

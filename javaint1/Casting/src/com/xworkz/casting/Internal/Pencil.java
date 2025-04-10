package com.xworkz.casting.Internal;

public class Pencil {
    private String brand;
    private String type;
    private double price;

    public Pencil(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pencil [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("PencilHashCode (from super): " + super.hashCode());
        return 2800;
    }
}

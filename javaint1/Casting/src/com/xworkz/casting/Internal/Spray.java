package com.xworkz.casting.Internal;

public class Spray {
    private String brand;
    private String type;
    private double price;

    public Spray(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Spray [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("SprayHashCode (from super): " + super.hashCode());
        return 4900;
    }
}

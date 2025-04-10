package com.xworkz.casting.Internal;

public class Knife {
    private String brand;
    private String material;
    private double price;

    public Knife(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Knife [brand=" + brand + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("KnifeHashCode (from super): " + super.hashCode());
        return 2700;
    }
}

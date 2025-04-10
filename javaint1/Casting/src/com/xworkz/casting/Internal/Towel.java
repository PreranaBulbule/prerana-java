package com.xworkz.casting.Internal;

public class Towel {
    private String brand;
    private String material;
    private double price;

    public Towel(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Towel [brand=" + brand + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("TowelHashCode (from super): " + super.hashCode());
        return 5800;
    }
}

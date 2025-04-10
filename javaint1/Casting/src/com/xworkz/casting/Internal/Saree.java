package com.xworkz.casting.Internal;

public class Saree {
    private String brand;
    private String material;
    private double price;

    public Saree(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Saree [brand=" + brand + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("SareeHashCode (from super): " + super.hashCode());
        return 4000;
    }
}

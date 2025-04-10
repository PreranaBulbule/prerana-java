package com.xworkz.casting.Internal;

public class Bedsheet {
    private String brand;
    private String material;
    private double price;

    public Bedsheet(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bedsheet [brand=" + brand + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BedsheetHashCode (from super): " + super.hashCode());
        return 444;
    }
}

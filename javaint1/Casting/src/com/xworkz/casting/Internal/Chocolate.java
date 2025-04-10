package com.xworkz.casting.Internal;

public class Chocolate {
    private String brand;
    private String flavor;
    private double price;

    public Chocolate(String brand, String flavor, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chocolate [brand=" + brand + ", flavor=" + flavor + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("ChocolateHashCode (from super): " + super.hashCode());
        return 1001;
    }
}

package com.xworkz.casting.Internal;

public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone [brand=" + brand + ", model=" + model + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("PhoneHashCode (from super): " + super.hashCode());
        return 2900;
    }
}

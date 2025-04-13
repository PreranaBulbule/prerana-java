package com.xworkz.casting.Internal;

public class Chocolate {
    private String brand;
    private String name;
    private double price;

    public Chocolate() {
        System.out.println("Running no-arg constructor of Chocolate");
        this.brand = "Nestle";
        this.name = "Munch";
        this.price = 20.00;
    }

    public Chocolate(String brand, String name, double price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Name: " + name + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("ChocolateHashCode (from super): " + super.hashCode());
        return 1313; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chocolate) {
                System.out.println("have ref. will compare..");
                Chocolate c1 = this;
                Chocolate c2 = (Chocolate) obj;
                if (c1.brand.equals(c2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

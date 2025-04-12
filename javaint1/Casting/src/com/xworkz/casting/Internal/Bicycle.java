package com.xworkz.casting.Internal;

public class Bicycle {
    private String brand;
    private String type;
    private double price;

    public Bicycle() {
        System.out.println("Running no-arg constructor of Bicycle");
        this.brand = "Hero";
        this.type = "Road Bike";
        this.price = 15000.00;
    }

    public Bicycle(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BicycleHashCode (from super): " + super.hashCode());
        return 333;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bicycle) {
                System.out.println("have ref. will compare..");
                Bicycle bicycle1 = this;
                Bicycle bicycle2 = (Bicycle) obj;
                if (bicycle1.brand.equals(bicycle2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

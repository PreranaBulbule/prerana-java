package com.xworkz.casting.Internal;

public class Display {
    private String brand;
    private String type;
    private double price;

    public Display() {
        System.out.println("Running no-arg constructor of Display");
        this.brand = "LG";
        this.type = "LCD";
        this.price = 15000.00;
    }

    public Display(String brand, String type, double price) {
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
        System.out.println("DisplayHashCode (from super): " + super.hashCode());
        return 5050; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Display) {
                System.out.println("have ref. will compare..");
                Display d1 = this;
                Display d2 = (Display) obj;
                if (d1.brand.equals(d2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

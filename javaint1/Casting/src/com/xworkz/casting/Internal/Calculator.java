package com.xworkz.casting.Internal;

public class Calculator {
    private String brand;
    private String model;
    private double price;

    public Calculator() {
        System.out.println("Running no-arg constructor of Calculator");
        this.brand = "Canon";
        this.model = "LS-123K";
        this.price = 15.00;
    }

    public Calculator(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("CalculatorHashCode (from super): " + super.hashCode());
        return 4444; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Calculator) {
                System.out.println("have ref. will compare..");
                Calculator calc1 = this;
                Calculator calc2 = (Calculator) obj;
                if (calc1.brand.equals(calc2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

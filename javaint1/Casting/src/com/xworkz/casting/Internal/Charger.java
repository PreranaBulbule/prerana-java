package com.xworkz.casting.Internal;

public class Charger {
    private String brand;
    private String type;
    private double price;

    public Charger() {
        System.out.println("Running no-arg constructor of Charger");
        this.brand = "Mi";
        this.type = "Micro-USB";
        this.price = 9.99;
    }

    public Charger(String brand, String type, double price) {
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
        System.out.println("ChargerHashCode (from super): " + super.hashCode());
        return 9999; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Charger) {
                System.out.println("have ref. will compare..");
                Charger charger1 = this;
                Charger charger2 = (Charger) obj;
                if (charger1.brand.equals(charger2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

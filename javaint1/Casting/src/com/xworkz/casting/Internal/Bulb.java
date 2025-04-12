package com.xworkz.casting.Internal;

public class Bulb {
    private String brand;
    private String type;
    private double price;

    public Bulb() {
        System.out.println("Running no-arg constructor of Bulb");
        this.brand = "Crompton";
        this.type = "Incandescent";
        this.price = 50.00;
    }

    public Bulb(String brand, String type, double price) {
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
        System.out.println("BulbHashCode (from super): " + super.hashCode());
        return 1111;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bulb) {
                System.out.println("have ref. will compare..");
                Bulb bulb1 = this;
                Bulb bulb2 = (Bulb) obj;
                if (bulb1.brand.equals(bulb2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

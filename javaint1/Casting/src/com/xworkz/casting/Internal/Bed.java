package com.xworkz.casting.Internal;

public class Bed {
    private String brand;
    private String size;
    private double price;

    public Bed() {
        System.out.println("Running no-arg constructor of Bed");
        this.brand = "Sleepwell";
        this.size = "Queen Size";
        this.price = 20000.00;
    }

    public Bed(String brand, String size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Size: " + size + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BedHashCode (from super): " + super.hashCode());
        return 666;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bed) {
                System.out.println("have ref. will compare..");
                Bed bed1 = this;
                Bed bed2 = (Bed) obj;
                if (bed1.brand.equals(bed2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

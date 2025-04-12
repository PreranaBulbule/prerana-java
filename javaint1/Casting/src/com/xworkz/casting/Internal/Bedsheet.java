package com.xworkz.casting.Internal;

public class Bedsheet {
    private String brand;
    private String material;
    private double price;

    public Bedsheet() {
        System.out.println("Running no-arg constructor of Bedsheet");
        this.brand = "Raymond";
        this.material = "Polyester";
        this.price = 999.99;
    }

    public Bedsheet(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Material: " + material + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BedsheetHashCode (from super): " + super.hashCode());
        return 555;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bedsheet) {
                System.out.println("have ref. will compare..");
                Bedsheet bedsheet1 = this;
                Bedsheet bedsheet2 = (Bedsheet) obj;
                if (bedsheet1.brand.equals(bedsheet2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

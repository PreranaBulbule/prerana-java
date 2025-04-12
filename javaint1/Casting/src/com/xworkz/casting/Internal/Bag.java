package com.xworkz.casting.Internal;

public class Bag {
    private String brand;
    private String type;
    private double price;

    public Bag() {
        System.out.println("Running no-arg constructor of Bag");
        this.brand = "Wildcraft";
        this.type = "Laptop Bag";
        this.price = 1500.0;
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
        System.out.println("BagHashCode (from super): " + super.hashCode());
        return 999;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bag) {
                System.out.println("have ref. will compare..");
                Bag bag1 = this;
                Bag bag2 = (Bag) obj;
                if (bag1.brand.equals(bag2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

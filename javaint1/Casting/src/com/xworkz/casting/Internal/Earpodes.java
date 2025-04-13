package com.xworkz.casting.Internal;

public class Earpodes {
    private String brand;
    private String type;
    private double price;

    public Earpodes(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Earpodes{brand=" + brand + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("EarpodesHashCode: " + super.hashCode());
        return 12345;  // You can use a custom hash code value here
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Earpodes) {
                System.out.println("have ref. will compare..");
                Earpodes earpodes1 = this;
                Earpodes earpodes2 = (Earpodes) obj;
                if (earpodes1.brand.equals(earpodes2.brand) && earpodes1.type.equals(earpodes2.type) && earpodes1.price == earpodes2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Moisturizer {
    private String brand;
    private String type;
    private double price;

    public Moisturizer(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Moisturizer{brand=" + brand + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("MoisturizerHashCode: " + super.hashCode());
        return 1234;  // Custom hash code for Moisturizer
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
            if (obj instanceof Moisturizer) {
                System.out.println("have ref. will compare..");
                Moisturizer moisturizer1 = this;
                Moisturizer moisturizer2 = (Moisturizer) obj;
                if (moisturizer1.brand.equals(moisturizer2.brand) && moisturizer1.type.equals(moisturizer2.type) && moisturizer1.price == moisturizer2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

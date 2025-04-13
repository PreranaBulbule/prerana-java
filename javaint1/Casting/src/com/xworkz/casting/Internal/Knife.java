package com.xworkz.casting.Internal;

public class Knife {
    private String brand;
    private String material;
    private double price;

    public Knife(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Knife{brand=" + brand + ", material=" + material + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("KnifeHashCode: " + super.hashCode());
        return 1234;  // Custom hash code for Knife
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Knife) {
                System.out.println("have ref. will compare..");
                Knife knife1 = this;
                Knife knife2 = (Knife) obj;
                if (knife1.brand.equals(knife2.brand) && knife1.material.equals(knife2.material) && knife1.price == knife2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

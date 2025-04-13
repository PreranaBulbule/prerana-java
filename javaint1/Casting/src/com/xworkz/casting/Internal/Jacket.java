package com.xworkz.casting.Internal;

public class Jacket {
    private String brand;
    private String material;
    private double price;

    public Jacket(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jacket{brand=" + brand + ", material=" + material + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("JacketHashCode: " + super.hashCode());
        return 12345;  // Custom hash code for Jacket
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
            if (obj instanceof Jacket) {
                System.out.println("have ref. will compare..");
                Jacket jacket1 = this;
                Jacket jacket2 = (Jacket) obj;
                if (jacket1.brand.equals(jacket2.brand) && jacket1.material.equals(jacket2.material) && jacket1.price == jacket2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

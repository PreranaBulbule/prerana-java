package com.xworkz.casting.Internal;

public class Specs {
    private String brand;
    private String frameMaterial;
    private double price;

    public Specs(String brand, String frameMaterial, double price) {
        this.brand = brand;
        this.frameMaterial = frameMaterial;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Specs{brand=" + brand + ", frameMaterial=" + frameMaterial + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SpecsHashCode: " + super.hashCode());
        return 67890; // Return a custom hashCode value
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Specs) {
                System.out.println("have ref. will compare..");
                Specs specs1 = this;
                Specs specs2 = (Specs) obj;
                if (specs1.brand.equals(specs2.brand) &&
                        specs1.frameMaterial.equals(specs2.frameMaterial) &&
                        specs1.price == specs2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Towel {
    private String brand;
    private String material;
    private double price;

    public Towel(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Towel{brand='" + brand + "', material='" + material + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Towel HashCode: " + super.hashCode());
        return 67890; // Custom hashCode value
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Towel) {
                System.out.println("Comparing Towel objects...");
                Towel towel1 = this;
                Towel towel2 = (Towel) obj;
                if (towel1.brand.equals(towel2.brand) &&
                        towel1.material.equals(towel2.material) &&
                        towel1.price == towel2.price) {
                    System.out.println("Both towels are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}

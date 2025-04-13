package com.xworkz.casting.Internal;

public class Pillow {
    private String brand;
    private String material;
    private double price;

    public Pillow(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Material: " + material + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("PillowHashCode: " + super.hashCode());
        return 789;
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
            if (obj instanceof Pillow) {
                Pillow pillow1 = this;
                Pillow pillow2 = (Pillow) obj;
                if (pillow1.brand.equals(pillow2.brand) && pillow1.material.equals(pillow2.material) && pillow1.price == pillow2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}

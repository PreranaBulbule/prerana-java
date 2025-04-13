package com.xworkz.casting.Internal;

public class Purse {
    private String brand;
    private String color;
    private double price;

    public Purse(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Color: " + color + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("PurseHashCode: " + super.hashCode());
        return 5678;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Purse) {
                Purse purse1 = this;
                Purse purse2 = (Purse) obj;
                if (purse1.brand.equals(purse2.brand) && purse1.color.equals(purse2.color) && purse1.price == purse2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}

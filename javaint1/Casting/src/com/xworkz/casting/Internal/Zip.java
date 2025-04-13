package com.xworkz.casting.Internal;

public class Zip {
    private String brand;
    private String color;
    private double price;

    public Zip(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Zip{brand='" + brand + "', color='" + color + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        // Custom hashCode (overridden)
        return 6900;
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
            if (obj instanceof Zip) {
                Zip z1 = this;
                Zip z2 = (Zip) obj;
                if (z1.brand.equals(z2.brand) &&
                        z1.color.equals(z2.color) &&
                        z1.price == z2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}

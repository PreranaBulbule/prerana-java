package com.xworkz.casting.Internal;

public class Sharpener {
    private String brand;
    private String color;
    private double price;

    public Sharpener(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sharpener{brand=" + brand + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SharpenerHashCode: " + super.hashCode());
        return 4040;
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
            System.out.println("ref is not null");
            if (obj instanceof Sharpener) {
                System.out.println("have ref. will compare..");
                Sharpener s1 = this;
                Sharpener s2 = (Sharpener) obj;
                if (s1.brand.equals(s2.brand) &&
                        s1.color.equals(s2.color) &&
                        s1.price == s2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

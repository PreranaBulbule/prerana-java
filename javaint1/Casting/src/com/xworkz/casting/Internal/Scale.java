package com.xworkz.casting.Internal;

public class Scale {
    private String material;
    private double length;
    private double price;

    public Scale(String material, double length, double price) {
        this.material = material;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Scale{material=" + material + ", length=" + length + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("ScaleHashCode: " + super.hashCode());
        return 4242;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Scale) {
                System.out.println("have ref. will compare..");
                Scale s1 = this;
                Scale s2 = (Scale) obj;
                if (s1.material.equals(s2.material) &&
                        s1.length == s2.length &&
                        s1.price == s2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

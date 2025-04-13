package com.xworkz.casting.Internal;

public class Shoe {
    private String brand;
    private String type;
    private double price;

    public Shoe(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoe{brand=" + brand + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("ShoeHashCode: " + super.hashCode());
        return 12345;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Shoe) {
                System.out.println("have ref. will compare..");
                Shoe s1 = this;
                Shoe s2 = (Shoe) obj;
                if (s1.brand.equals(s2.brand) &&
                        s1.type.equals(s2.type) &&
                        s1.price == s2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class NailPolish {
    private String brand;
    private String color;
    private double price;

    public NailPolish(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "NailPolish{brand=" + brand + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("NailPolishHashCode: " + super.hashCode());
        return 4321;  // Custom hash code for NailPolish
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof NailPolish) {
                System.out.println("have ref. will compare..");
                NailPolish nailPolish1 = this;
                NailPolish nailPolish2 = (NailPolish) obj;
                if (nailPolish1.brand.equals(nailPolish2.brand) && nailPolish1.color.equals(nailPolish2.color) && nailPolish1.price == nailPolish2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

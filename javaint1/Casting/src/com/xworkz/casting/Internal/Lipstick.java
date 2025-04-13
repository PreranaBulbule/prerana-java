package com.xworkz.casting.Internal;

public class Lipstick {
    private String brand;
    private String color;
    private double price;

    public Lipstick(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lipstick{brand=" + brand + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("LipstickHashCode: " + super.hashCode());
        return 1234;  // Custom hash code for Lipstick
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
            if (obj instanceof Lipstick) {
                System.out.println("have ref. will compare..");
                Lipstick lipstick1 = this;
                Lipstick lipstick2 = (Lipstick) obj;
                if (lipstick1.brand.equals(lipstick2.brand) && lipstick1.color.equals(lipstick2.color) && lipstick1.price == lipstick2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

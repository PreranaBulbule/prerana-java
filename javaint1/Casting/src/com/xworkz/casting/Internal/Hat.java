package com.xworkz.casting.Internal;

public class Hat {
    private String brand;
    private String color;
    private double price;

    public Hat(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hat{brand=" + brand + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("HatHashCode: " + super.hashCode());
        return 1123;  // Custom hash code value for Hat
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
            if (obj instanceof Hat) {
                System.out.println("have ref. will compare..");
                Hat hat1 = this;
                Hat hat2 = (Hat) obj;
                if (hat1.brand.equals(hat2.brand) && hat1.color.equals(hat2.color) && hat1.price == hat2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

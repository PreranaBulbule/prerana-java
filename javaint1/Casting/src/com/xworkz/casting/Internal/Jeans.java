package com.xworkz.casting.Internal;

public class Jeans {
    private String brand;
    private String size;
    private double price;

    public Jeans(String brand, String size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jeans{brand=" + brand + ", size=" + size + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("JeansHashCode: " + super.hashCode());
        return 12345;  // Custom hash code for Jeans
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Jeans) {
                System.out.println("have ref. will compare..");
                Jeans jeans1 = this;
                Jeans jeans2 = (Jeans) obj;
                if (jeans1.brand.equals(jeans2.brand) && jeans1.size.equals(jeans2.size) && jeans1.price == jeans2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

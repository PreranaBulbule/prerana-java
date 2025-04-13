package com.xworkz.casting.Internal;

public class Top {
    private String brand;
    private String size;
    private double price;

    public Top(String brand, String size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Top{brand='" + brand + "', size='" + size + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Top HashCode: " + super.hashCode());
        return 12345; // Custom hashCode value
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Top) {
                System.out.println("Comparing Top objects...");
                Top top1 = this;
                Top top2 = (Top) obj;
                if (top1.brand.equals(top2.brand) &&
                        top1.size.equals(top2.size) &&
                        top1.price == top2.price) {
                    System.out.println("Both tops are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}

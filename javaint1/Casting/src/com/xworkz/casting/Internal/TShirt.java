package com.xworkz.casting.Internal;

public class TShirt {
    private String brand;
    private String size;
    private double price;

    public TShirt(String brand, String size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TShirt{brand='" + brand + "', size='" + size + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("TShirt HashCode: " + super.hashCode());
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
            if (obj instanceof TShirt) {
                System.out.println("Comparing TShirt objects...");
                TShirt tShirt1 = this;
                TShirt tShirt2 = (TShirt) obj;
                if (tShirt1.brand.equals(tShirt2.brand) &&
                        tShirt1.size.equals(tShirt2.size) &&
                        tShirt1.price == tShirt2.price) {
                    System.out.println("Both TShirts are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Wheatflour {
    private String brand;
    private String packagingType;
    private double price;

    public Wheatflour(String brand, String packagingType, double price) {
        this.brand = brand;
        this.packagingType = packagingType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wheatflour{brand='" + brand + "', packagingType='" + packagingType + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {

        System.out.println("Wheatflour hashCode: " + super.hashCode());
        return 98765; // Custom hashCode
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Wheatflour) {
                System.out.println("Comparing Wheatflour objects...");
                Wheatflour w1 = this;
                Wheatflour w2 = (Wheatflour) obj;
                if (w1.brand.equals(w2.brand) &&
                        w1.packagingType.equals(w2.packagingType) &&
                        w1.price == w2.price) {
                    System.out.println("Both Wheatflour objects are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}

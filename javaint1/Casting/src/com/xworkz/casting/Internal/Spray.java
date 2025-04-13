package com.xworkz.casting.Internal;

public class Spray {
    private String brand;
    private String type;
    private double price;

    public Spray(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Spray{brand=" + brand + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SprayHashCode: " + super.hashCode());
        return 123456; // Return a custom hashCode value
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
            if (obj instanceof Spray) {
                System.out.println("have ref. will compare..");
                Spray spray1 = this;
                Spray spray2 = (Spray) obj;
                if (spray1.brand.equals(spray2.brand) &&
                        spray1.type.equals(spray2.type) &&
                        spray1.price == spray2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

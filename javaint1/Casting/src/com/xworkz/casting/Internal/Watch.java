package com.xworkz.casting.Internal;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch{brand='" + brand + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        // Custom hashCode value
        System.out.println("Watch hashCode: " + super.hashCode());
        return 12345; // Custom hashCode
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
            System.out.println("Reference is not null");
            if (obj instanceof Watch) {
                System.out.println("Comparing Watch objects...");
                Watch w1 = this;
                Watch w2 = (Watch) obj;
                if (w1.brand.equals(w2.brand) &&
                        w1.type.equals(w2.type) &&
                        w1.price == w2.price) {
                    System.out.println("Both Watch objects are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}

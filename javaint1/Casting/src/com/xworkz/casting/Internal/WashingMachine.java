package com.xworkz.casting.Internal;

public class WashingMachine {
    private String brand;
    private String type;
    private double price;

    public WashingMachine(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "WashingMachine{brand='" + brand + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("WashingMachine HashCode: " + super.hashCode());
        return 12345; // Custom hashCode value
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
            if (obj instanceof WashingMachine) {
                System.out.println("Comparing WashingMachine objects...");
                WashingMachine wm1 = this;
                WashingMachine wm2 = (WashingMachine) obj;
                if (wm1.brand.equals(wm2.brand) &&
                        wm1.type.equals(wm2.type) &&
                        wm1.price == wm2.price) {
                    System.out.println("Both WashingMachine objects are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}

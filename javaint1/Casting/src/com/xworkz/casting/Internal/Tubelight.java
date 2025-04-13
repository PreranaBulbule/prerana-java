package com.xworkz.casting.Internal;

public class Tubelight {
    private String brand;
    private String type;
    private double price;

    public Tubelight(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tubelight{brand='" + brand + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Tubelight HashCode: " + super.hashCode());
        return 67890; // Custom hashCode value
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
            if (obj instanceof Tubelight) {
                System.out.println("Comparing Tubelight objects...");
                Tubelight tubelight1 = this;
                Tubelight tubelight2 = (Tubelight) obj;
                if (tubelight1.brand.equals(tubelight2.brand) &&
                        tubelight1.type.equals(tubelight2.type) &&
                        tubelight1.price == tubelight2.price) {
                    System.out.println("Both Tubelights are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}

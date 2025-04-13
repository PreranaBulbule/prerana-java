package com.xworkz.casting.Internal;

public class Soap {
    private String brand;
    private String type;
    private double price;

    public Soap(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Soap{brand=" + brand + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SoapHashCode: " + super.hashCode());
        return 12345;
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
            if (obj instanceof Soap) {
                System.out.println("have ref. will compare..");
                Soap soap1 = this;
                Soap soap2 = (Soap) obj;
                if (soap1.brand.equals(soap2.brand) &&
                        soap1.type.equals(soap2.type) &&
                        soap1.price == soap2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

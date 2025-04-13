package com.xworkz.casting.Internal;

public class Pencil {
    private String brand;
    private String type;
    private double price;

    public Pencil(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pencil{brand=" + brand + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("PencilHashCode: " + super.hashCode());
        return 1234;  // Custom hash code for Pencil
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Pencil) {
                System.out.println("have ref. will compare..");
                Pencil pencil1 = this;
                Pencil pencil2 = (Pencil) obj;
                if (pencil1.brand.equals(pencil2.brand) && pencil1.type.equals(pencil2.type) && pencil1.price == pencil2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Paste {
    private String brand;
    private String type;
    private double price;

    public Paste(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paste{brand=" + brand + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("PasteHashCode: " + super.hashCode());
        return 7890;  // Custom hash code for Paste
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
            if (obj instanceof Paste) {
                System.out.println("have ref. will compare..");
                Paste paste1 = this;
                Paste paste2 = (Paste) obj;
                if (paste1.brand.equals(paste2.brand) && paste1.type.equals(paste2.type) && paste1.price == paste2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Wheatflour {
    private String brand;
    private String packaging;
    private double price;

    public Wheatflour(String brand, String packaging, double price) {
        this.brand = brand;
        this.packaging = packaging;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wheatflour [brand=" + brand + ", packaging=" + packaging + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("WheatflourHashCode (from super): " + super.hashCode());
        return 6600;
    }
}

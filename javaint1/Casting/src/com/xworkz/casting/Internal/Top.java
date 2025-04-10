package com.xworkz.casting.Internal;

public class Top {
    private String brand;
    private String size;
    private double price;

    public Top(String brand, String size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Top [brand=" + brand + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("TopHashCode (from super): " + super.hashCode());
        return 5700;
    }
}

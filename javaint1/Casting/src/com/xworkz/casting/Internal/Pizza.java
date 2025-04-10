package com.xworkz.casting.Internal;

public class Pizza {
    private String flavor;
    private String size;
    private double price;

    public Pizza(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza [flavor=" + flavor + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("PizzaHashCode (from super): " + super.hashCode());
        return 3100;
    }
}

package com.xworkz.casting.Internal;

public class Bottle {
    private String material;
    private double capacity;
    private double price;

    public Bottle(String material, double capacity, double price) {
        this.material = material;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bottle [material=" + material + ", capacity=" + capacity + " liters, price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BottleHashCode (from super): " + super.hashCode());
        return 888;
    }
}

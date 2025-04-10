package com.xworkz.casting.Internal;

public class Basket {
    private String material;
    private String color;
    private double capacity;

    public Basket(String material, String color, double capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Basket [material=" + material + ", color=" + color + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BasketHashCode (from super): " + super.hashCode());
        return 888;
    }
}

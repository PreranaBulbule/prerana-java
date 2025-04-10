package com.xworkz.casting.Internal;

public class Lunchbox {
    private String material;
    private String color;
    private double price;

    public Lunchbox(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lunchbox [material=" + material + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("LunchboxHashCode (from super): " + super.hashCode());
        return 1900;
    }
}

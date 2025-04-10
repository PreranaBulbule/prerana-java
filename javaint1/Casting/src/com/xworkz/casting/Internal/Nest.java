package com.xworkz.casting.Internal;

public class Nest {
    private String material;
    private String type;
    private double price;

    public Nest(String material, String type, double price) {
        this.material = material;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nest [material=" + material + ", type=" + type + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("NestHashCode (from super): " + super.hashCode());
        return 2300;
    }
}

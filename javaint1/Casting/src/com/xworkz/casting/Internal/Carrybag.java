package com.xworkz.casting.Internal;

public class Carrybag {
    private String material;
    private String color;
    private double price;

    public Carrybag(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Carrybag [material=" + material + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("CarrybagHashCode (from super): " + super.hashCode());
        return 555;
    }
}

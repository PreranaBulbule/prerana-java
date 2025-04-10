package com.xworkz.casting.Internal;

public class Door {
    private String material;
    private String color;
    private double price;

    public Door(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Door [material=" + material + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("DoorHashCode (from super): " + super.hashCode());
        return 1700;
    }
}

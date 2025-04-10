package com.xworkz.casting.Internal;

public class Belt {
    private String material;
    private String color;
    private double price;

    public Belt(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Belt [material=" + material + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BeltHashCode (from super): " + super.hashCode());
        return 333;
    }
}

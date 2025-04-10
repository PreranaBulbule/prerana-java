package com.xworkz.casting.Internal;

public class Box {
    private String material;
    private String size;
    private double price;

    public Box(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Box [material=" + material + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BoxHashCode (from super): " + super.hashCode());
        return 999;
    }
}

package com.xworkz.casting.Internal;

public class Scale {
    private String material;
    private double length;
    private double price;

    public Scale(String material, double length, double price) {
        this.material = material;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Scale [material=" + material + ", length=" + length + " cm, price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("ScaleHashCode (from super): " + super.hashCode());
        return 4100;
    }
}

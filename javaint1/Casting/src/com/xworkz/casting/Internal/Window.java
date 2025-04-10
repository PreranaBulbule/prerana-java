package com.xworkz.casting.Internal;

public class Window {
    private String material;
    private String type;
    private double price;

    public Window(String material, String type, double price) {
        this.material = material;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Window [material=" + material + ", type=" + type + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("WindowHashCode (from super): " + super.hashCode());
        return 6700;
    }
}

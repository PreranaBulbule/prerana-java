package com.xworkz.casting.Internal;

public class Screen {
    private String type;
    private double size;
    private double price;

    public Screen(String type, double size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Screen [type=" + type + ", size=" + size + " inches, price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("ScreenHashCode (from super): " + super.hashCode());
        return 4200;
    }
}

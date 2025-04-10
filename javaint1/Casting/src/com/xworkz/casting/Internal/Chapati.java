package com.xworkz.casting.Internal;

public class Chapati {
    private String type;
    private String size;
    private double price;

    public Chapati(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chapati [type=" + type + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("ChapatiHashCode (from super): " + super.hashCode());
        return 777;
    }
}

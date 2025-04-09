package com.xworkz.casting.Internal;

public class Paper {
    private String type;
    private String size;
    private double price;

    public Paper(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paper [type=" + type + ", size=" + size + ", price=" + price + "]";
    }
}

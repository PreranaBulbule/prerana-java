package com.xworkz.casting.Internal;

public class Sweet {
    private String name;
    private String type;
    private double price;

    public Sweet(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweet [name=" + name + ", type=" + type + ", price=" + price + "]";
    }
}

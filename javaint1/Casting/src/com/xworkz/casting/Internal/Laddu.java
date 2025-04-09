package com.xworkz.casting.Internal;

public class Laddu {
    private String name;
    private String type;
    private double price;

    public Laddu(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laddu [name=" + name + ", type=" + type + ", price=" + price + "]";
    }

}

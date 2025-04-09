package com.xworkz.casting.Internal;

public class Tape {
    private String type;
    private double length;
    private double price;

    public Tape(String type, double length, double price) {
        this.type = type;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tape [type=" + type + ", length=" + length + " meters, price=" + price + "]";
    }
}

package com.xworkz.casting.Internal;

public class Uno {
    private String edition;
    private String color;
    private double price;

    public Uno(String edition, String color, double price) {
        this.edition = edition;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Uno [edition=" + edition + ", color=" + color + ", price=" + price + "]";
    }
}

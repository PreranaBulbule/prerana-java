package com.xworkz.casting.Internal;

public class Ball {
    private String type;
    private String material;
    private double price;

    public Ball(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball [type=" + type + ", material=" + material + ", price=" + price + "]";
    }
}

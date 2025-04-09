package com.xworkz.casting.Internal;

public class Iron {
    private String name;
    private String material;
    private double price;

    public Iron(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iron [name=" + name + ", material=" + material + ", price=" + price + "]";
    }
}

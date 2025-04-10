package com.xworkz.casting.Internal;

public class Burger {
    private String type;
    private String size;
    private double price;

    public Burger(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Burger [type=" + type + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BurgerHashCode (from super): " + super.hashCode());
        return 111;
    }

}

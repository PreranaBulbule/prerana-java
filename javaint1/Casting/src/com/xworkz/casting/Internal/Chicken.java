package com.xworkz.casting.Internal;

public class Chicken {
    private String type;
    private String cut;
    private double price;

    public Chicken(String type, String cut, double price) {
        this.type = type;
        this.cut = cut;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chicken [type=" + type + ", cut=" + cut + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("ChickenHashCode (from super): " + super.hashCode());
        return 999;
    }

}

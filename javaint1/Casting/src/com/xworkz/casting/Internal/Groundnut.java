package com.xworkz.casting.Internal;

public class Groundnut {
    private String type;
    private String packaging;
    private double price;

    public Groundnut(String type, String packaging, double price) {
        this.type = type;
        this.packaging = packaging;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Groundnut [type=" + type + ", packaging=" + packaging + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("GroundnutHashCode (from super): " + super.hashCode());
        return 1900;
    }
}

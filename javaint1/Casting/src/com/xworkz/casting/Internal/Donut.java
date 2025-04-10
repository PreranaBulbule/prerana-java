package com.xworkz.casting.Internal;

public class Donut {
    private String flavor;
    private String size;
    private double price;

    public Donut(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Donut [flavor=" + flavor + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("DonutHashCode (from super): " + super.hashCode());
        return 1600;
    }

}

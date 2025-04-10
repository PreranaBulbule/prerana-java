package com.xworkz.casting.Internal;

public class Mirror {
    private String material;
    private String shape;
    private double price;

    public Mirror(String material, String shape, double price) {
        this.material = material;
        this.shape = shape;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mirror [material=" + material + ", shape=" + shape + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("MirrorHashCode (from super): " + super.hashCode());
        return 2000;
    }
}

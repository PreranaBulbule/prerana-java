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
        return "Mirror{material=" + material + ", shape=" + shape + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("MirrorHashCode: " + super.hashCode());
        return 5678;  // Custom hash code for Mirror
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mirror) {
                System.out.println("have ref. will compare..");
                Mirror mirror1 = this;
                Mirror mirror2 = (Mirror) obj;
                if (mirror1.material.equals(mirror2.material) && mirror1.shape.equals(mirror2.shape) && mirror1.price == mirror2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

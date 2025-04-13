package com.xworkz.casting.Internal;

public class Wire {
    private String material;
    private double length;
    private double price;

    public Wire(String material, double length, double price) {
        this.material = material;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wire{material='" + material + "', length=" + length + " meters, price=" + price + "}";
    }

    @Override
    public int hashCode() {
        return 98765;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Wire) {
                Wire w1 = this;
                Wire w2 = (Wire) obj;
                if (w1.material.equals(w2.material) &&
                        w1.length == w2.length &&
                        w1.price == w2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}

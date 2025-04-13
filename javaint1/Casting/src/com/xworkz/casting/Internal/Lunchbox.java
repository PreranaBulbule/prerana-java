package com.xworkz.casting.Internal;

public class Lunchbox {
    private String material;
    private String color;
    private double price;

    public Lunchbox(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lunchbox{material=" + material + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("LunchboxHashCode: " + super.hashCode());
        return 1234;  // Custom hash code for Lunchbox
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Lunchbox) {
                System.out.println("have ref. will compare..");
                Lunchbox lunchbox1 = this;
                Lunchbox lunchbox2 = (Lunchbox) obj;
                if (lunchbox1.material.equals(lunchbox2.material) && lunchbox1.color.equals(lunchbox2.color) && lunchbox1.price == lunchbox2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

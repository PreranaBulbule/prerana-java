package com.xworkz.casting.Internal;

public class Dustbin {
    private String material;
    private String color;
    private double price;

    public Dustbin(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dustbin{material=" + material + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("DustbinHashCode: " + super.hashCode());
        return 1234;  // You can use a custom hash code value here
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
            if (obj instanceof Dustbin) {
                System.out.println("have ref. will compare..");
                Dustbin dustbin1 = this;
                Dustbin dustbin2 = (Dustbin) obj;
                if (dustbin1.material.equals(dustbin2.material) && dustbin1.color.equals(dustbin2.color) && dustbin1.price == dustbin2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

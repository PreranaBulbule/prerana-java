package com.xworkz.casting.Internal;

public class Floor {
    private String material;
    private String color;
    private double price;

    public Floor(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Floor{material=" + material + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FloorHashCode: " + super.hashCode());
        return 1234;  // Custom hash code value for Floor
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
            if (obj instanceof Floor) {
                System.out.println("have ref. will compare..");
                Floor floor1 = this;
                Floor floor2 = (Floor) obj;
                if (floor1.material.equals(floor2.material) && floor1.color.equals(floor2.color) && floor1.price == floor2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

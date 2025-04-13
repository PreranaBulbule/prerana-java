package com.xworkz.casting.Internal;

public class Door {
    private String material;
    private String color;
    private double price;

    public Door(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Door{material=" + material + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("DoorHashCode: " + super.hashCode());
        return 8372;
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
            if (obj instanceof Door) {
                System.out.println("have ref. will compare..");
                Door door1 = this;
                Door door2 = (Door) obj;
                if (door1.material.equals(door2.material) && door1.color.equals(door2.color) && door1.price == door2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

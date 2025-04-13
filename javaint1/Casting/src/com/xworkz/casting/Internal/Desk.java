package com.xworkz.casting.Internal;

public class Desk {
    private String material;
    private String color;
    private double price;

    public Desk() {
        System.out.println("Running no-arg constructor of Desk");
        this.material = "Metal";
        this.color = "Black";
        this.price = 1800.00;
    }

    public Desk(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Color: " + color + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("DeskHashCode (from super): " + super.hashCode());
        return 3030; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Desk) {
                System.out.println("have ref. will compare..");
                Desk d1 = this;
                Desk d2 = (Desk) obj;
                if (d1.material.equals(d2.material)) {
                    System.out.println("both are same material");
                    return true;
                }
            }
        }
        return false;
    }
}

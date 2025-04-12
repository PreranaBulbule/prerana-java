package com.xworkz.casting.Internal;

public class Box {
    private String material;
    private String size;
    private double price;

    public Box() {
        System.out.println("Running no-arg constructor of Box");
        this.material = "Wood";
        this.size = "Large";
        this.price = 300.00;
    }

    public Box(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Size: " + size + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BoxHashCode (from super): " + super.hashCode());
        return 777;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Box) {
                System.out.println("have ref. will compare..");
                Box box1 = this;
                Box box2 = (Box) obj;
                if (box1.material.equals(box2.material)) {
                    System.out.println("both are same material");
                    return true;
                }
            }
        }
        return false;
    }
}

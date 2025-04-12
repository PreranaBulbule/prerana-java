package com.xworkz.casting.Internal;

public class Basket {
    private String material;
    private String color;
    private double size;

    public Basket() {
        System.out.println("Running no-arg constructor of Basket");
        this.material = "Bamboo";
        this.color = "Natural";
        this.size = 4.0;
    }

    public Basket(String material, String color, double size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Color: " + color + ", Size: " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("BasketHashCode (from super): " + super.hashCode());
        return 777;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Basket) {
                System.out.println("have ref. will compare..");
                Basket basket1 = this;
                Basket basket2 = (Basket) obj;
                if (basket1.material.equals(basket2.material)) {
                    System.out.println("both are same material");
                    return true;
                }
            }
        }
        return false;
    }
}

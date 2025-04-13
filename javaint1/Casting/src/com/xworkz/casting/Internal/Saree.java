package com.xworkz.casting.Internal;

public class Saree {
    private String type;
    private String material;
    private double price;

    public Saree(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Saree{type=" + type + ", material=" + material + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SareeHashCode: " + super.hashCode());
        return 3030;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Saree) {
                System.out.println("have ref. will compare..");
                Saree s1 = this;
                Saree s2 = (Saree) obj;
                if (s1.type.equals(s2.type) &&
                        s1.material.equals(s2.material) &&
                        s1.price == s2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

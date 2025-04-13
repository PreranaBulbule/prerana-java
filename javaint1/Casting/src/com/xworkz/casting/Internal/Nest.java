package com.xworkz.casting.Internal;

public class Nest {
    private String material;
    private String type;
    private double price;

    public Nest(String material, String type, double price) {
        this.material = material;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nest{material=" + material + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("NestHashCode: " + super.hashCode());
        return 1234;  // Custom hash code for Nest
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Nest) {
                System.out.println("have ref. will compare..");
                Nest nest1 = this;
                Nest nest2 = (Nest) obj;
                if (nest1.material.equals(nest2.material) && nest1.type.equals(nest2.type) && nest1.price == nest2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

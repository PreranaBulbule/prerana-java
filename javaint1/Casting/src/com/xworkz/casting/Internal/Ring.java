package com.xworkz.casting.Internal;

public class Ring {
    private String material;
    private String size;
    private double price;

    public Ring(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ring{material=" + material + ", size=" + size + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("RingHashCode: " + super.hashCode());
        return 8888;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Ring) {
                System.out.println("have ref. will compare..");
                Ring r1 = this;
                Ring r2 = (Ring) obj;
                if (r1.material.equals(r2.material) && r1.size.equals(r2.size) && r1.price == r2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Drum {
    private String material;
    private double size;
    private double price;

    public Drum(String material, double size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drum{material=" + material + ", size=" + size + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("DrumHashCode: " + super.hashCode());
        return 9456;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Drum) {
                System.out.println("have ref. will compare..");
                Drum drum1 = this;
                Drum drum2 = (Drum) obj;
                if (drum1.material.equals(drum2.material) && drum1.size == drum2.size && drum1.price == drum2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Plate {
    private String material;
    private String size;
    private double price;

    public Plate(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Size: " + size + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("PlateHashCode: " + super.hashCode());
        return 5678;
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
            if (obj instanceof Plate) {
                Plate plate1 = this;
                Plate plate2 = (Plate) obj;
                if (plate1.material.equals(plate2.material) && plate1.size.equals(plate2.size) && plate1.price == plate2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Floor {
    private String material;
    private String color;
    private double pricePerSquareMeter;

    public Floor(String material, String color, double pricePerSquareMeter) {
        this.material = material;
        this.color = color;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    @Override
    public String toString() {
        return "Floor [material=" + material + ", color=" + color + ", pricePerSquareMeter=" + pricePerSquareMeter + "]";
    }

}

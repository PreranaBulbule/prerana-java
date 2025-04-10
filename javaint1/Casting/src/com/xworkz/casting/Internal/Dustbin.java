package com.xworkz.casting.Internal;

public class Dustbin {
    private String material;
    private String color;
    private double capacity;

    public Dustbin(String material, String color, double capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Dustbin [material=" + material + ", color=" + color + ", capacity=" + capacity + " liters]";
    }
    @Override
    public int hashCode() {
        System.out.println("DustbinHashCode (from super): " + super.hashCode());
        return 1900;
    }
}

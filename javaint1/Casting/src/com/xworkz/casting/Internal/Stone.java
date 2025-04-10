package com.xworkz.casting.Internal;

public class Stone {
    private String type;
    private String color;
    private double weight;

    public Stone(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Stone [type=" + type + ", color=" + color + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("StoneHashCode (from super): " + super.hashCode());
        return 5100;
    }
}

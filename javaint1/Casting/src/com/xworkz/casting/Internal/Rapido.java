package com.xworkz.casting.Internal;

public class Rapido {
    private String model;
    private String color;
    private double fare;

    public Rapido(String model, String color, double fare) {
        this.model = model;
        this.color = color;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Rapido [model=" + model + ", color=" + color + ", fare=" + fare + "]";
    }
}

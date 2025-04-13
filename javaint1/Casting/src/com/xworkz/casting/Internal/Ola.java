package com.xworkz.casting.Internal;

public class Ola {
    private String model;
    private String color;
    private double fare;

    public Ola(String model, String color, double fare) {
        this.model = model;
        this.color = color;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Ola{model=" + model + ", color=" + color + ", fare=" + fare + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("OlaHashCode: " + super.hashCode());
        return 5678;  // Custom hash code for Ola
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Ola) {
                System.out.println("have ref. will compare..");
                Ola ola1 = this;
                Ola ola2 = (Ola) obj;
                if (ola1.model.equals(ola2.model) && ola1.color.equals(ola2.color) && ola1.fare == ola2.fare) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

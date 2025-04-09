package com.xworkz.casting.Internal;

public class Uber {
    private String carModel;
    private String carColor;
    private double fare;

    public Uber(String carModel, String carColor, double fare) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Uber [carModel=" + carModel + ", carColor=" + carColor + ", fare=" + fare + "]";
    }
}

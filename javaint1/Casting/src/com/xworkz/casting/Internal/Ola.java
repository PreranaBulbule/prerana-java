package com.xworkz.casting.Internal;

public class Ola {
    private String carModel;
    private String carColor;
    private double fare;

    public Ola(String carModel, String carColor, double fare) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Ola [carModel=" + carModel + ", carColor=" + carColor + ", fare=" + fare + "]";
    }
}

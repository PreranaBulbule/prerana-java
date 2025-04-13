package com.xworkz.casting.Internal;

public class Rapido {
    private String vehicle;
    private String color;
    private double fare;

    public Rapido(String vehicle, String color, double fare) {
        this.vehicle = vehicle;
        this.color = color;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Vehicle: " + vehicle + ", Color: " + color + ", Fare: " + fare;
    }

    @Override
    public int hashCode() {
        System.out.println("RapidoHashCode: " + super.hashCode());
        return 8989;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Rapido) {
                Rapido r1 = this;
                Rapido r2 = (Rapido) obj;
                if (r1.vehicle.equals(r2.vehicle) && r1.color.equals(r2.color) && r1.fare == r2.fare) {
                    return true;
                }
            }
        }
        return false;
    }
}

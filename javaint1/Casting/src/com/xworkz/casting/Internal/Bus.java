package com.xworkz.casting.Internal;

public class Bus {
    private String routeNumber;
    private String busType;
    private double fare;

    public Bus(String routeNumber, String busType, double fare) {
        this.routeNumber = routeNumber;
        this.busType = busType;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Bus [routeNumber=" + routeNumber + ", busType=" + busType + ", fare=" + fare + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BusHashCode (from super): " + super.hashCode());
        return 222;
    }
}

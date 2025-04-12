package com.xworkz.casting.Internal;

public class Bus {
    private String routeNumber;
    private String type;
    private double fare;

    public Bus() {
        System.out.println("Running no-arg constructor of Bus");
        this.routeNumber = "100A";
        this.type = "Express";
        this.fare = 30.00;
    }

    public Bus(String routeNumber, String type, double fare) {
        this.routeNumber = routeNumber;
        this.type = type;
        this.fare = fare;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    @Override
    public String toString() {
        return "Route Number: " + routeNumber + ", Type: " + type + ", Fare: " + fare;
    }

    @Override
    public int hashCode() {
        System.out.println("BusHashCode (from super): " + super.hashCode());
        return 3333; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bus) {
                System.out.println("have ref. will compare..");
                Bus bus1 = this;
                Bus bus2 = (Bus) obj;
                if (bus1.routeNumber.equals(bus2.routeNumber)) {
                    System.out.println("both are same route number");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.Satellite;

public class Satellite {
    private SatelliteType type;
    private double cost;
    private double weight;
    private double loadCapacity;

    public SatelliteType getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setType(SatelliteType type) {
        this.type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void displayDetails() {
        System.out.println("Satellite Type: " + type);
        System.out.println("Cost: $" + cost + " million");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}


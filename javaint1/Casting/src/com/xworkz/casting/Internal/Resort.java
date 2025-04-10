package com.xworkz.casting.Internal;

public class Resort {
    private String name;
    private String location;
    private double pricePerNight;

    public Resort(String name, String location, double pricePerNight) {
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Resort [name=" + name + ", location=" + location + ", pricePerNight=" + pricePerNight + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("ResortHashCode (from super): " + super.hashCode());
        return 3600;
    }
}

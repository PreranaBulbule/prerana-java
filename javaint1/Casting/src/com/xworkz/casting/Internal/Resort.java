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

}

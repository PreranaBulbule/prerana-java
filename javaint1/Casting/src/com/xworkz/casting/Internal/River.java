package com.xworkz.casting.Internal;

public class River {
    private String name;
    private String country;
    private double length;

    public River(String name, String country, double length) {
        this.name = name;
        this.country = country;
        this.length = length;
    }

    @Override
    public String toString() {
        return "River [name=" + name + ", country=" + country + ", length=" + length + " km]";
    }
    @Override
    public int hashCode() {
        System.out.println("RiverHashCode (from super): " + super.hashCode());
        return 3800;
    }
}

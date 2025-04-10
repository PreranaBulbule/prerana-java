package com.xworkz.casting.Internal;

public class Fish {
    private String species;
    private String size;
    private double price;

    public Fish(String species, String size, double price) {
        this.species = species;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fish [species=" + species + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("FishHashCode (from super): " + super.hashCode());
        return 2100;
    }
}

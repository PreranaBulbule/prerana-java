package com.xworkz.casting.Internal;

public class Chicken {
    private String breed;
    private String part;
    private double price;

    public Chicken() {
        System.out.println("Running no-arg constructor of Chicken");
        this.breed = "Country";
        this.part = "Thigh";
        this.price = 10.99;
    }

    public Chicken(String breed, String part, double price) {
        this.breed = breed;
        this.part = part;
        this.price = price;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Breed: " + breed + ", Part: " + part + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("ChickenHashCode (from super): " + super.hashCode());
        return 1212; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chicken) {
                System.out.println("have ref. will compare..");
                Chicken c1 = this;
                Chicken c2 = (Chicken) obj;
                if (c1.breed.equals(c2.breed)) {
                    System.out.println("both are same breed");
                    return true;
                }
            }
        }
        return false;
    }
}

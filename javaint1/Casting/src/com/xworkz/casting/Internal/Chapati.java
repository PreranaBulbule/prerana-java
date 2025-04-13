package com.xworkz.casting.Internal;

public class Chapati {
    private String flourType;
    private String size;
    private double price;

    public Chapati() {
        System.out.println("Running no-arg constructor of Chapati");
        this.flourType = "Wheat";
        this.size = "Regular";
        this.price = 1.00;
    }

    public Chapati(String flourType, String size, double price) {
        this.flourType = flourType;
        this.size = size;
        this.price = price;
    }

    public void setFlourType(String flourType) {
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return "Flour Type: " + flourType + ", Size: " + size + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("ChapatiHashCode (from super): " + super.hashCode());
        return 8888; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chapati) {
                System.out.println("have ref. will compare..");
                Chapati chapati1 = this;
                Chapati chapati2 = (Chapati) obj;
                if (chapati1.flourType.equals(chapati2.flourType)) {
                    System.out.println("both are same flour type");
                    return true;
                }
            }
        }
        return false;
    }
}

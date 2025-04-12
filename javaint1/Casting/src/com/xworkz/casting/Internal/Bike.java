package com.xworkz.casting.Internal;

public class Bike {
    private String model;
    private String color;
    private double price;

    public Bike() {
        System.out.println("Running no-arg constructor of Bike");
        this.model = "Suzuki Gixxer";
        this.color = "Black";
        this.price = 90000.00;
    }

    public Bike(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BikeHashCode (from super): " + super.hashCode());
        return 222;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bike) {
                System.out.println("have ref. will compare..");
                Bike bike1 = this;
                Bike bike2 = (Bike) obj;
                if (bike1.model.equals(bike2.model)) {
                    System.out.println("both are same model");
                    return true;
                }
            }
        }
        return false;
    }
}

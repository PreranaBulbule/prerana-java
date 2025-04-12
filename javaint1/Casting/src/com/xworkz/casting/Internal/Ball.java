package com.xworkz.casting.Internal;

public class Ball {
    private String type;
    private String material;
    private double price;

    public Ball() {
        System.out.println("Running no-arg constructor of Ball");
        this.type = "Cricket Ball";
        this.material = "Leather";
        this.price = 499.99;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Material: " + material + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BallHashCode (from super): " + super.hashCode());
        return 888; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Ball) {
                System.out.println("have ref. will compare..");
                Ball ball1 = this;
                Ball ball2 = (Ball) obj;
                if (ball1.type.equals(ball2.type)) {
                    System.out.println("both are same type");
                    return true;
                }
            }
        }
        return false;
    }
}

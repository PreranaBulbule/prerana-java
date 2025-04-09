package com.xworkz.casting.Internal;

public class Steel {
    private String grade;
    private String type;
    private double price;

    public Steel(String grade, String type, double price) {
        this.grade = grade;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Steel [grade=" + grade + ", type=" + type + ", price=" + price + "]";
    }
}

package com.xworkz.casting.Internal;

public class Calendar {
    private String year;
    private String type;
    private double price;

    public Calendar(String year, String type, double price) {
        this.year = year;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Calendar [year=" + year + ", type=" + type + ", price=" + price + "]";
    }

}

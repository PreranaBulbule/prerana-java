package com.xworkz.casting.Internal;

public class Switch {
    private String type;
    private String brand;
    private double price;

    public Switch(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Switch [type=" + type + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("SwitchHashCode (from super): " + super.hashCode());
        return 5300;
    }
}

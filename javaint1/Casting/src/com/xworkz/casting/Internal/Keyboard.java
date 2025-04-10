package com.xworkz.casting.Internal;

public class Keyboard {
    private String name;
    private String type;
    private double price;

    public Keyboard(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard [name=" + name + ", type=" + type + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("KeyboardHashCode (from super): " + super.hashCode());
        return 2600;
    }
}

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
        return "Keyboard{name=" + name + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("KeyboardHashCode: " + super.hashCode());
        return 6789;  // Custom hash code for Keyboard
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Keyboard) {
                System.out.println("have ref. will compare..");
                Keyboard keyboard1 = this;
                Keyboard keyboard2 = (Keyboard) obj;
                if (keyboard1.name.equals(keyboard2.name) && keyboard1.type.equals(keyboard2.type) && keyboard1.price == keyboard2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

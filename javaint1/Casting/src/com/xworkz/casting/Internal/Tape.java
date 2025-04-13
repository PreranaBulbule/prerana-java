package com.xworkz.casting.Internal;

public class Tape {
    private String type;
    private int length;
    private double price;

    public Tape(String type, int length, double price) {
        this.type = type;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tape{type='" + type + "', length=" + length + " meters, price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("TapeHashCode: " + super.hashCode());
        return 54321; // Custom hashCode value
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Tape) {
                System.out.println("have ref. will compare..");
                Tape tape1 = this;
                Tape tape2 = (Tape) obj;
                if (tape1.type.equals(tape2.type) &&
                        tape1.length == tape2.length &&
                        tape1.price == tape2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

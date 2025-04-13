package com.xworkz.casting.Internal;

public class Stone {
    private String type;
    private String color;
    private double weight;

    public Stone(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Stone{type=" + type + ", color=" + color + ", weight=" + weight + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("StoneHashCode: " + super.hashCode());
        return 12345; // Return a custom hashCode value
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Stone) {
                System.out.println("have ref. will compare..");
                Stone stone1 = this;
                Stone stone2 = (Stone) obj;
                if (stone1.type.equals(stone2.type) &&
                        stone1.color.equals(stone2.color) &&
                        stone1.weight == stone2.weight) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

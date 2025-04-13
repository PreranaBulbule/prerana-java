package com.xworkz.casting.Internal;

public class Laddu {
    private String name;
    private String type;
    private double price;

    public Laddu(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laddu{name=" + name + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("LadduHashCode: " + super.hashCode());
        return 7890;  // Custom hash code for Laddu
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
            if (obj instanceof Laddu) {
                System.out.println("have ref. will compare..");
                Laddu laddu1 = this;
                Laddu laddu2 = (Laddu) obj;
                if (laddu1.name.equals(laddu2.name) && laddu1.type.equals(laddu2.type) && laddu1.price == laddu2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

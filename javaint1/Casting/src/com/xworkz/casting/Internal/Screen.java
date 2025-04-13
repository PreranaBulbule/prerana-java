package com.xworkz.casting.Internal;

public class Screen {
    private String type;
    private double size;
    private double price;

    public Screen(String type, double size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Screen{type=" + type + ", size=" + size + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("ScreenHashCode: " + super.hashCode());
        return 3030;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Screen) {
                System.out.println("have ref. will compare..");
                Screen s1 = this;
                Screen s2 = (Screen) obj;
                if (s1.type.equals(s2.type) &&
                        s1.size == s2.size &&
                        s1.price == s2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Fish {
    private String type;
    private String size;
    private double price;

    public Fish(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fish{type=" + type + ", size=" + size + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FishHashCode: " + super.hashCode());
        return 5632;  // You can use a custom hash code value here
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Fish) {
                System.out.println("have ref. will compare..");
                Fish fish1 = this;
                Fish fish2 = (Fish) obj;
                if (fish1.type.equals(fish2.type) && fish1.size.equals(fish2.size) && fish1.price == fish2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

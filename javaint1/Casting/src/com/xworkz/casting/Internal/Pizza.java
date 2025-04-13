package com.xworkz.casting.Internal;

public class Pizza {
    private String name;
    private String size;
    private double price;

    public Pizza(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Size: " + size + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("PizzaHashCode: " + super.hashCode());
        return 1234;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Pizza) {
                Pizza pizza1 = this;
                Pizza pizza2 = (Pizza) obj;
                if (pizza1.name.equals(pizza2.name) && pizza1.size.equals(pizza2.size) && pizza1.price == pizza2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}

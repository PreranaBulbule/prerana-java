package com.xworkz.casting.Internal;

public class Burger {
    private String type;
    private String size;
    private double price;

    public Burger() {
        System.out.println("Running no-arg constructor of Burger");
        this.type = "Veg";
        this.size = "Medium";
        this.price = 100.00;
    }

    public Burger(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Size: " + size + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BurgerHashCode (from super): " + super.hashCode());
        return 2222;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Burger) {
                System.out.println("have ref. will compare..");
                Burger burger1 = this;
                Burger burger2 = (Burger) obj;
                if (burger1.type.equals(burger2.type)) {
                    System.out.println("both are same type");
                    return true;
                }
            }
        }
        return false;
    }
}

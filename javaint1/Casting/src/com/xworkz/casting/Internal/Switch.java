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
        return "Switch{type='" + type + "', brand='" + brand + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SwitchHashCode: " + super.hashCode());
        return 12345; // Custom hashCode value
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Switch) {
                System.out.println("have ref. will compare..");
                Switch switch1 = this;
                Switch switch2 = (Switch) obj;
                if (switch1.type.equals(switch2.type) &&
                        switch1.brand.equals(switch2.brand) &&
                        switch1.price == switch2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

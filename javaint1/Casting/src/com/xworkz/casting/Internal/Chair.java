package com.xworkz.casting.Internal;

public class Chair {
    private String type;
    private String material;
    private double price;

    public Chair() {
        System.out.println("Running no-arg constructor of Chair");
        this.type = "Office Chair";
        this.material = "Plastic";
        this.price = 1999.99;
    }

    public Chair(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Material: " + material + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("ChairHashCode (from super): " + super.hashCode());
        return 7777; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chair) {
                System.out.println("have ref. will compare..");
                Chair chair1 = this;
                Chair chair2 = (Chair) obj;
                if (chair1.type.equals(chair2.type)) {
                    System.out.println("both are same type");
                    return true;
                }
            }
        }
        return false;
    }
}

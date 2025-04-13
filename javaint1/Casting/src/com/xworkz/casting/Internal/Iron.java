package com.xworkz.casting.Internal;

public class Iron {
    private String type;
    private String material;
    private double price;

    public Iron(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iron{type=" + type + ", material=" + material + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("IronHashCode: " + super.hashCode());
        return 9876;  // Custom hash code for Iron
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Iron) {
                System.out.println("have ref. will compare..");
                Iron iron1 = this;
                Iron iron2 = (Iron) obj;
                if (iron1.type.equals(iron2.type) && iron1.material.equals(iron2.material) && iron1.price == iron2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Groundnut {
    private String type;
    private String packaging;
    private double price;

    public Groundnut(String type, String packaging, double price) {
        this.type = type;
        this.packaging = packaging;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Groundnut{type=" + type + ", packaging=" + packaging + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("GroundnutHashCode: " + super.hashCode());
        return 8321;  // Custom hash code value for Groundnut
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Groundnut) {
                System.out.println("have ref. will compare..");
                Groundnut groundnut1 = this;
                Groundnut groundnut2 = (Groundnut) obj;
                if (groundnut1.type.equals(groundnut2.type) && groundnut1.packaging.equals(groundnut2.packaging) && groundnut1.price == groundnut2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

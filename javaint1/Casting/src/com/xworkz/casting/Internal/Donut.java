package com.xworkz.casting.Internal;

public class Donut {
    private String flavor;
    private String size;
    private double price;

    public Donut(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Donut{flavor=" + flavor + ", size=" + size + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("DonutHashCode: " + super.hashCode());
        return 7373;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Donut) {
                System.out.println("have ref. will compare..");
                Donut d1 = this;
                Donut d2 = (Donut) obj;
                if (d1.flavor.equals(d2.flavor) && d1.size.equals(d2.size)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

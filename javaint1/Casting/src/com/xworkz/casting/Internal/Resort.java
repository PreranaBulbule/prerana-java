package com.xworkz.casting.Internal;

public class Resort {
    private String name;
    private String location;
    private double price;

    public Resort(String name, String location, double price) {
        this.name = name;
        this.location = location;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Resort{name=" + name + ", location=" + location + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("ResortHashCode: " + super.hashCode());
        return 9090;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Resort) {
                System.out.println("have ref. will compare..");
                Resort r1 = this;
                Resort r2 = (Resort) obj;
                if (r1.name.equals(r2.name) && r1.location.equals(r2.location) && r1.price == r2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class River {
    private String name;
    private String location;
    private double length;

    public River(String name, String location, double length) {
        this.name = name;
        this.location = location;
        this.length = length;
    }

    @Override
    public String toString() {
        return "River{name=" + name + ", location=" + location + ", length=" + length + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("RiverHashCode: " + super.hashCode());
        return 7788;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof River) {
                System.out.println("have ref. will compare..");
                River r1 = this;
                River r2 = (River) obj;
                if (r1.name.equals(r2.name) && r1.location.equals(r2.location) && r1.length == r2.length) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

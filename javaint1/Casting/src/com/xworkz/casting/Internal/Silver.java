package com.xworkz.casting.Internal;

public class Silver {
    private String type;
    private double weight;
    private double price;

    public Silver(String type, double weight, double price) {
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Silver{type=" + type + ", weight=" + weight + "kg, price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SilverHashCode: " + super.hashCode());
        return 56789;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Silver) {
                System.out.println("have ref. will compare..");
                Silver silver1 = this;
                Silver silver2 = (Silver) obj;
                if (silver1.type.equals(silver2.type) &&
                        silver1.weight == silver2.weight &&
                        silver1.price == silver2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

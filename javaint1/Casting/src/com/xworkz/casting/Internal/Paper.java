package com.xworkz.casting.Internal;

public class Paper {
    private String type;
    private String size;
    private double price;

    public Paper(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paper{type=" + type + ", size=" + size + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("PaperHashCode: " + super.hashCode());
        return 5678;  // Custom hash code for Paper
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Paper) {
                System.out.println("have ref. will compare..");
                Paper paper1 = this;
                Paper paper2 = (Paper) obj;
                if (paper1.type.equals(paper2.type) && paper1.size.equals(paper2.size) && paper1.price == paper2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Steel {
    private String grade;
    private String type;
    private double price;

    public Steel(String grade, String type, double price) {
        this.grade = grade;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Steel{grade=" + grade + ", type=" + type + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SteelHashCode: " + super.hashCode());
        return 98765; // Return a custom hashCode value
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Steel) {
                System.out.println("have ref. will compare..");
                Steel steel1 = this;
                Steel steel2 = (Steel) obj;
                if (steel1.grade.equals(steel2.grade) &&
                        steel1.type.equals(steel2.type) &&
                        steel1.price == steel2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

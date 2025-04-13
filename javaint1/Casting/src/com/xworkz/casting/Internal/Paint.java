package com.xworkz.casting.Internal;

public class Paint {
    private String brand;
    private String color;
    private double price;

    public Paint(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paint{brand=" + brand + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("PaintHashCode: " + super.hashCode());
        return 1234;  // Custom hash code for Paint
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Paint) {
                System.out.println("have ref. will compare..");
                Paint paint1 = this;
                Paint paint2 = (Paint) obj;
                if (paint1.brand.equals(paint2.brand) && paint1.color.equals(paint2.color) && paint1.price == paint2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

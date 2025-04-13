package com.xworkz.casting.Internal;

public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{brand=" + brand + ", model=" + model + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("PhoneHashCode: " + super.hashCode());
        return 5678;  // Custom hash code for Phone
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Phone) {
                System.out.println("have ref. will compare..");
                Phone phone1 = this;
                Phone phone2 = (Phone) obj;
                if (phone1.brand.equals(phone2.brand) && phone1.model.equals(phone2.model) && phone1.price == phone2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.casting.Internal;

public class Tab {
    private String brand;
    private String model;
    private double price;

    public Tab(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tab{brand='" + brand + "', model='" + model + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("TabHashCode: " + super.hashCode());
        return 12345; // Custom hashCode value
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Tab) {
                System.out.println("have ref. will compare..");
                Tab tab1 = this;
                Tab tab2 = (Tab) obj;
                if (tab1.brand.equals(tab2.brand) &&
                        tab1.model.equals(tab2.model) &&
                        tab1.price == tab2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

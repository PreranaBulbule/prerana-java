package com.xworkz.casting.Internal;

public class Sweet {
    private String name;
    private String type;
    private double price;

    public Sweet(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweet{name='" + name + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SweetHashCode: " + super.hashCode());
        return 98765; // Return a custom hashCode value
    }

    public void setName(String name) {
        this.name = name;
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
            if (obj instanceof Sweet) {
                System.out.println("have ref. will compare..");
                Sweet sweet1 = this;
                Sweet sweet2 = (Sweet) obj;
                if (sweet1.name.equals(sweet2.name) &&
                        sweet1.type.equals(sweet2.type) &&
                        sweet1.price == sweet2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

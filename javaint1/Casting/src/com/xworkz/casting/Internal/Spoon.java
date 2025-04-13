package com.xworkz.casting.Internal;

public class Spoon {
    private String material;
    private String size;
    private double price;

    public Spoon(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Spoon{material=" + material + ", size=" + size + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("SpoonHashCode: " + super.hashCode());
        return 12345; // Return a custom hashCode value
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Spoon) {
                System.out.println("have ref. will compare..");
                Spoon spoon1 = this;
                Spoon spoon2 = (Spoon) obj;
                if (spoon1.material.equals(spoon2.material) &&
                        spoon1.size.equals(spoon2.size) &&
                        spoon1.price == spoon2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

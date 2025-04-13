package com.xworkz.casting.Internal;

public class Table {
    private String name;
    private String material;
    private double price;

    public Table(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Table{name='" + name + "', material='" + material + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("TableHashCode: " + super.hashCode());
        return 56789; // Custom hashCode value
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Table) {
                System.out.println("have ref. will compare..");
                Table table1 = this;
                Table table2 = (Table) obj;
                if (table1.name.equals(table2.name) &&
                        table1.material.equals(table2.material) &&
                        table1.price == table2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

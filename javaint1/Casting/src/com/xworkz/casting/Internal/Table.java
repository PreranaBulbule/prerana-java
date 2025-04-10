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
        return "Table [name=" + name + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("TableHashCode (from super): " + super.hashCode());
        return 5500;
    }
}

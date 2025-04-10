package com.xworkz.casting.Internal;

public class Lock {
    private String material;
    private String size;
    private double price;

    public Lock(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lock [material=" + material + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("LockHashCode (from super): " + super.hashCode());
        return 1600;
    }
}

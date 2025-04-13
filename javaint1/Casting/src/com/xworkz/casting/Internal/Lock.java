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
        return "Lock{material=" + material + ", size=" + size + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("LockHashCode: " + super.hashCode());
        return 5678;  // Custom hash code for Lock
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Lock) {
                System.out.println("have ref. will compare..");
                Lock lock1 = this;
                Lock lock2 = (Lock) obj;
                if (lock1.material.equals(lock2.material) && lock1.size.equals(lock2.size) && lock1.price == lock2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

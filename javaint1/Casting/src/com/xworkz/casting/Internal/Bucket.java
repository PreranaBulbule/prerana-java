package com.xworkz.casting.Internal;

public class Bucket {
    private String material;
    private double capacity;
    private double price;

    public Bucket() {
        System.out.println("Running no-arg constructor of Bucket");
        this.material = "Metal";
        this.capacity = 10.0;
        this.price = 100.00;
    }

    public Bucket(String material, double capacity, double price) {
        this.material = material;
        this.capacity = capacity;
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Capacity: " + capacity + "L, Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BucketHashCode (from super): " + super.hashCode());
        return 999;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bucket) {
                System.out.println("have ref. will compare..");
                Bucket bucket1 = this;
                Bucket bucket2 = (Bucket) obj;
                if (bucket1.material.equals(bucket2.material)) {
                    System.out.println("both are same material");
                    return true;
                }
            }
        }
        return false;
    }
}

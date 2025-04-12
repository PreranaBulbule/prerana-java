package com.xworkz.casting.Internal;

public class Bluetooth {
    private String brand;
    private String type;
    private double price;

    public Bluetooth() {
        System.out.println("Running no-arg constructor of Bluetooth");
        this.brand = "JBL";
        this.type = "Wired";
        this.price = 1500.00;
    }

    public Bluetooth(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BluetoothHashCode (from super): " + super.hashCode());
        return 111;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bluetooth) {
                System.out.println("have ref. will compare..");
                Bluetooth bluetooth1 = this;
                Bluetooth bluetooth2 = (Bluetooth) obj;
                if (bluetooth1.brand.equals(bluetooth2.brand)) {
                    System.out.println("both are same brand");
                    return true;
                }
            }
        }
        return false;
    }
}

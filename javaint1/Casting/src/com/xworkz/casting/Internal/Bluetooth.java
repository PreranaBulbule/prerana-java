package com.xworkz.casting.Internal;

public class Bluetooth {
    private String brand;
    private String type;
    private double price;

    public Bluetooth(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bluetooth [brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BluetoothHashCode (from super): " + super.hashCode());
        return 666;
    }
}

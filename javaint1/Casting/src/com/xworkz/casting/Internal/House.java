package com.xworkz.casting.Internal;

public class House {
    private String address;
    private int numberOfRooms;
    private double price;

    public House(String address, int numberOfRooms, double price) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    @Override
    public String toString() {
        return "House [address=" + address + ", numberOfRooms=" + numberOfRooms + ", price=" + price + "]";
    }
}

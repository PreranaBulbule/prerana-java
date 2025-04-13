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
        return "House{address=" + address + ", numberOfRooms=" + numberOfRooms + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("HouseHashCode: " + super.hashCode());
        return 1857;  // Custom hash code value for House
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof House) {
                System.out.println("have ref. will compare..");
                House house1 = this;
                House house2 = (House) obj;
                if (house1.address.equals(house2.address) && house1.numberOfRooms == house2.numberOfRooms && house1.price == house2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

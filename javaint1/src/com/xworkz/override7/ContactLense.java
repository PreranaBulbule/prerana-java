package com.xworkz.override7;

public class ContactLense extends Lense {
    public ContactLense() {
        super();
        System.out.println("Running non-arg constructor ContactLense--child");
    }

    @Override
    public void getType() {
        System.out.println("Contact lense type--child");
    }

    @Override
    public void getColor() {
        System.out.println("Contact lense color is clear--child");
    }

    @Override
    public void getSize() {
        System.out.println("Contact lense size is small--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Contact lense material is soft plastic--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Contact lense price is $20 per pair--child");
    }

    public void getUVProtection() {
        System.out.println("Contact lense has UV protection--child only method");
    }
}

package com.xworkz.override24;

public class WoodenDoor extends Door {
    public WoodenDoor() {
        super();
        System.out.println("Running non-arg constructor WoodenDoor--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Wooden door is made of wood--child");
    }

    @Override
    public void getSize() {
        System.out.println("Wooden door size is medium--child");
    }

    @Override
    public void getColor() {
        System.out.println("Wooden door color is brown--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Wooden door price is $100--child");
    }

    @Override
    public void getType() {
        System.out.println("Wooden door is a type of traditional door--child");
    }

    public void getDurability() {
        System.out.println("Wooden door has a high durability--child only method");
    }
}
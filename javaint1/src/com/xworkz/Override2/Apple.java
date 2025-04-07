package com.xworkz.Override2;

public class Apple extends Fruit {
    public Apple() {
        super();
        System.out.println("Running non-arg constructor Apple--child");
    }

    @Override
    public void getColor() {
        System.out.println("Apple is red or green--child");
    }

    @Override
    public void getTaste() {
        System.out.println("Apple tastes sweet and tangy--child");
    }

    @Override
    public void getType() {
        System.out.println("Apple is a type of fruit--child");
    }

    @Override
    public void getSize() {
        System.out.println("Apple size is medium--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Apple price is $1 per unit--child");
    }

    public void getSeason() {
        System.out.println("Apple season is from late summer to fall--child");
    }
}

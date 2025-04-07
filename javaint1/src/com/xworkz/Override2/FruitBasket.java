package com.xworkz.Override2;

public class FruitBasket {
    public void manage(Fruit fruit) {
        fruit.getColor();
        fruit.getTaste();
        fruit.getType();
        fruit.getSize();
        fruit.getPrice();

        if(fruit instanceof Apple) {
            System.out.println("fruit is instance of Apple");
            Apple apple = (Apple) fruit;
            apple.getSeason();
        }
    }
}

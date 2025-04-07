package com.xworkz.Runner;

import com.xworkz.Override2.Apple;
import com.xworkz.Override2.Fruit;
import com.xworkz.Override2.FruitBasket;

public class FruitRunner {
    public static void main(String[] args) {
            Fruit apple1 = new Apple();
            apple1.getColor();
            apple1.getTaste();
            apple1.getType();
            apple1.getSize();
            apple1.getPrice();

            System.out.println("-------------------");
            Fruit apple2 = new Apple();
            apple2.getColor();
            apple2.getTaste();
            apple2.getType();
            apple2.getSize();
            apple2.getPrice();

            System.out.println("-----------------");
            Apple apple3 = new Apple();
            apple3.getColor();
            apple3.getTaste();
            apple3.getType();
            apple3.getSize();
            apple3.getPrice();
            apple3.getSeason();

            System.out.println("------------------");
            FruitBasket fruitBasket = new FruitBasket();
            fruitBasket.manage(apple2);
            fruitBasket.manage(apple1);
            fruitBasket.manage(apple3);
        }
}

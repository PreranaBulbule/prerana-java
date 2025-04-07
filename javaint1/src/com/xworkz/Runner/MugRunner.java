package com.xworkz.Runner;
import com.xworkz.override33.Mug;
import com.xworkz.override33.CoffeeMug;
import com.xworkz.override33.MugStore;

public class MugRunner {
    public static void main(String[] args) {
        Mug mug1 = new Mug();
        mug1.getBrand();
        mug1.getColor();
        mug1.getSize();
        mug1.getMaterial();
        mug1.getPrice();

        System.out.println("-------------------");
        Mug mug2 = new CoffeeMug();
        mug2.getBrand();
        mug2.getColor();
        mug2.getSize();
        mug2.getMaterial();
        mug2.getPrice();

        System.out.println("-----------------");
        CoffeeMug coffeeMug = new CoffeeMug();
        coffeeMug.getBrand();
        coffeeMug.getColor();
        coffeeMug.getSize();
        coffeeMug.getMaterial();
        coffeeMug.getPrice();
        coffeeMug.getHandleType();

        System.out.println("------------------");
        MugStore mugStore = new MugStore();
        mugStore.manage(mug2);
        mugStore.manage(mug1);
        mugStore.manage(coffeeMug);
    }
}

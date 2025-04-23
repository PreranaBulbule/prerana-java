package com.xworkz.Interface.Internal;

public class CheesePizzaPackagerImpl implements PizzaPackager {
    public CheesePizzaPackagerImpl() {
        System.out.println("No-arg constructor of CheesePizzaPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing pizza using Cheese Pizza Packager");
    }
}

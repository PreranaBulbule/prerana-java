package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Pizza;
import com.xworkz.Interface.Internal.CheesePizzaPackagerImpl;

public class PizzaRunner {
    public static void main(String[] args) {
        CheesePizzaPackagerImpl packager = new CheesePizzaPackagerImpl();
        Pizza pizza = new Pizza(packager);
        pizza.startPackaging();
    }
}

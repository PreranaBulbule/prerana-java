package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Pizza;

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza margheritaPizza = new Pizza("Margherita", "Large", 499.99);
        System.out.println(margheritaPizza);
        System.out.println("Custom hashCode (overridden): " + margheritaPizza.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(margheritaPizza));
    }
}


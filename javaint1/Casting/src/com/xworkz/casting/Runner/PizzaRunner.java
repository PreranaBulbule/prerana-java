package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Pizza;

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza margheritaPizza = new Pizza("Margherita", "Large", 499.99);
        System.out.println(margheritaPizza);
        System.out.println("Custom hashCode (overridden): " + margheritaPizza.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(margheritaPizza));

        Pizza pizza1 = new Pizza("Margherita", "Large", 499.99);
        Pizza pizza2 = new Pizza("Margherita", "Large", 499.99);
        boolean areSame = pizza1.equals(pizza2);
        System.out.println("Are both pizzas the same? " + areSame);

        Pizza pizza3 = new Pizza("Veg Supreme", "Medium", 399.99);
        boolean areDifferent = pizza1.equals(pizza3);
        System.out.println("Are both pizzas the same? " + areDifferent);
    }
}

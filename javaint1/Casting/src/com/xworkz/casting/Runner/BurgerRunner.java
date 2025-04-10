package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Burger;

public class BurgerRunner {
    public static void main(String[] args) {
        Burger cheeseburger = new Burger("Cheese", "Medium", 150.00);
        System.out.println(cheeseburger);
        System.out.println("Custom hashCode (overridden): " + cheeseburger.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(cheeseburger));
    }
}


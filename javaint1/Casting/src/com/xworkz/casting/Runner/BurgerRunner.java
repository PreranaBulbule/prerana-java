package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Burger;

public class BurgerRunner {
    public static void main(String[] args) {
        Burger cheeseburger = new Burger("Cheese", "Medium", 150.00);
        System.out.println(cheeseburger);
        System.out.println("Custom hashCode (overridden): " + cheeseburger.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(cheeseburger));

        Burger burger1 = new Burger();
        burger1.setType("Cheese");

        Burger burger2 = new Burger();
        burger2.setType("Cheese");

        boolean same = burger1.equals(burger2);
        System.out.println("Both same type: " + same);
    }
}



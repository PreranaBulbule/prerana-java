package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Basket;

public class BasketRunner {
    public static void main(String[] args) {
        Basket fruitBasket = new Basket("Wicker", "Brown", 5.5);
        System.out.println(fruitBasket);
        System.out.println("Custom hashCode (overridden): " + fruitBasket.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(fruitBasket));
    }
}


package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Basket;

public class BasketRunner {
    public static void main(String[] args) {
        Basket fruitBasket = new Basket("Wicker", "Brown", 5.5);
        System.out.println(fruitBasket);
        System.out.println("Custom hashCode (overridden): " + fruitBasket.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(fruitBasket));

        Basket basket1 = new Basket();
        basket1.setMaterial("Plastic");

        Basket basket2 = new Basket();
        basket2.setMaterial("Plastic");

        boolean same = basket1.equals(basket2);
        System.out.println("Both same material: " + same);
    }
}



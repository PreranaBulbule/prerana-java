package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Chocolate;

public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate dairyMilk = new Chocolate("Cadbury", "Dairy Milk", 150.00);
        System.out.println(dairyMilk);
        System.out.println("Custom hashCode (overridden): " + dairyMilk.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(dairyMilk));
    }
}


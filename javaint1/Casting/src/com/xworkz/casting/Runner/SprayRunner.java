package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Spray;

public class SprayRunner {
    public static void main(String[] args) {
        Spray airFreshener = new Spray("Odonil", "Air Freshener", 150.00);
        System.out.println(airFreshener);
        System.out.println("Custom hashCode (overridden): " + airFreshener.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(airFreshener));
    }
}


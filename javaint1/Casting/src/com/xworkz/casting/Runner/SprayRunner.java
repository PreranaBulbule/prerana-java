package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Spray;

public class SprayRunner {
    public static void main(String[] args) {
        Spray airFreshener = new Spray("Odonil", "Air Freshener", 150.00);
        System.out.println(airFreshener);
        System.out.println("Custom hashCode (overridden): " + airFreshener.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(airFreshener));

        Spray s1 = new Spray("Odonil", "Air Freshener", 150.00);
        Spray s2 = new Spray("Odonil", "Air Freshener", 150.00);
        boolean same = s1.equals(s2);
        System.out.println("Both sprays are same: " + same);

        Spray s3 = new Spray("Ambi Pur", "Air Freshener", 120.00);
        Spray s4 = new Spray("Odonil", "Air Freshener", 150.00);
        boolean different = s3.equals(s4);
        System.out.println("Both sprays are same: " + different);
    }
}

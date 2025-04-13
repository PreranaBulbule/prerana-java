package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Purse;

public class PurseRunner {
    public static void main(String[] args) {
        Purse gucciPurse = new Purse("Gucci", "Black", 7999.99);
        System.out.println(gucciPurse);
        System.out.println("Custom hashCode (overridden): " + gucciPurse.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(gucciPurse));

        Purse purse1 = new Purse("Gucci", "Black", 7999.99);
        Purse purse2 = new Purse("Gucci", "Black", 7999.99);
        boolean areSame = purse1.equals(purse2);
        System.out.println("Are both purses the same? " + areSame);

        Purse purse3 = new Purse("Chanel", "Red", 9999.99);
        boolean areDifferent = purse1.equals(purse3);
        System.out.println("Are both purses the same? " + areDifferent);
    }
}

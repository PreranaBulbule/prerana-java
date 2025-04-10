package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Purse;

public class PurseRunner {
    public static void main(String[] args) {
        Purse gucciPurse = new Purse("Gucci", "Black", 7999.99);
        System.out.println(gucciPurse);
        System.out.println("Custom hashCode (overridden): " + gucciPurse.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(gucciPurse));
    }
}


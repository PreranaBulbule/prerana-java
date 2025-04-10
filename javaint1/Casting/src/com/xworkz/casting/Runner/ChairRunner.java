package com.xworkz.casting.Runner;

import com.xworkz.casting.Internal.Chair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair diningChair = new Chair("Dining Chair", "Wood", 2999.99);
        System.out.println(diningChair);
        System.out.println("Custom hashCode (overridden): " + diningChair.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(diningChair));
    }
}



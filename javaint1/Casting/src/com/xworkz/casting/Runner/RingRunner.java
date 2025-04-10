package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Ring;

public class RingRunner {
    public static void main(String[] args) {
        Ring diamondRing = new Ring("Gold", "M", 50000.00);
        System.out.println(diamondRing);
        System.out.println("Custom hashCode (overridden): " + diamondRing.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(diamondRing));
    }
}

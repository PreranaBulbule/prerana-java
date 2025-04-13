package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Ring;

public class RingRunner {
    public static void main(String[] args) {
        Ring diamondRing = new Ring("Gold", "M", 50000.00);
        System.out.println(diamondRing);
        System.out.println("Custom hashCode (overridden): " + diamondRing.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(diamondRing));

        Ring ring1 = new Ring("Gold", "M", 50000.00);
        Ring ring2 = new Ring("Gold", "M", 50000.00);
        boolean same = ring1.equals(ring2);
        System.out.println("Both rings are same: " + same);

        Ring ring3 = new Ring("Silver", "L", 3000.00);
        Ring ring4 = new Ring("Platinum", "S", 70000.00);
        boolean different = ring3.equals(ring4);
        System.out.println("Both rings are same: " + different);
    }
}

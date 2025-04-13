package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Tape;

public class TapeRunner {
    public static void main(String[] args) {
        Tape adhesiveTape = new Tape("Adhesive", 10, 3.50);
        System.out.println(adhesiveTape);
        System.out.println("Custom hashCode (overridden): " + adhesiveTape.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(adhesiveTape));

        Tape t1 = new Tape("Adhesive", 10, 3.50);
        Tape t2 = new Tape("Adhesive", 10, 3.50);
        boolean same = t1.equals(t2);
        System.out.println("Both tapes are same: " + same);

        Tape t3 = new Tape("Packing", 5, 2.00);
        boolean different = t1.equals(t3);
        System.out.println("Both tapes are same: " + different);
    }
}

package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Tape;

public class TapeRunner {
    public static void main(String[] args) {
        Tape adhesiveTape = new Tape("Adhesive", 10, 3.50);
        System.out.println(adhesiveTape);
        System.out.println("Custom hashCode (overridden): " + adhesiveTape.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(adhesiveTape));
    }
}

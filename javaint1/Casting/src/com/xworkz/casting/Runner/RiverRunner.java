package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.River;

public class RiverRunner {
    public static void main(String[] args) {
        River nileRiver = new River("Nile", "Egypt", 6650);
        System.out.println(nileRiver);
        System.out.println("Custom hashCode (overridden): " + nileRiver.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(nileRiver));

        River river1 = new River("Nile", "Egypt", 6650);
        River river2 = new River("Nile", "Egypt", 6650);
        boolean same = river1.equals(river2);
        System.out.println("Both rivers are same: " + same);

        River river3 = new River("Amazon", "Brazil", 6400);
        River river4 = new River("Ganges", "India", 2525);
        boolean different = river3.equals(river4);
        System.out.println("Both rivers are same: " + different);
    }
}

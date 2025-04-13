package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Nest;

public class NestRunner {
    public static void main(String[] args) {
        Nest birdNest = new Nest("Twigs", "Bird Nest", 12.99);
        System.out.println(birdNest);
        System.out.println("Custom hashCode (overridden): " + birdNest.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(birdNest));

        Nest nest1 = new Nest("Twigs", "Bird Nest", 12.99);
        Nest nest2 = new Nest("Twigs", "Bird Nest", 12.99);
        boolean same = nest1.equals(nest2);
        System.out.println("Both nests are same: " + same);

        Nest nest3 = new Nest("Leaves", "Bird Nest", 15.99);
        Nest nest4 = new Nest("Twigs", "Bird Nest", 12.99);
        boolean different = nest3.equals(nest4);
        System.out.println("Both nests are same: " + different);
    }
}

package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Nest;

public class NestRunner {
    public static void main(String[] args) {
        Nest birdNest = new Nest("Twigs", "Bird Nest", 12.99);
        System.out.println(birdNest);
        System.out.println("Custom hashCode (overridden): " + birdNest.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(birdNest));
    }
}



package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Ball;

public class BallRunner {
    public static void main(String[] args) {
        Ball football = new Ball("Football", "Leather", 999.99);
        System.out.println(football);
        System.out.println("Custom hashCode (overridden): " + football.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(football));
    }
}


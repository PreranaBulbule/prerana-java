package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Scale;

public class ScaleRunner {
    public static void main(String[] args) {
        Scale woodenScale = new Scale("Wood", 30.0, 50.00);
        System.out.println(woodenScale);
        System.out.println("Custom hashCode (overridden): " + woodenScale.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(woodenScale));
    }
}


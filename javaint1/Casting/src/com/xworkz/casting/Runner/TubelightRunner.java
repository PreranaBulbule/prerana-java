package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Tubelight;

public class TubelightRunner {
    public static void main(String[] args) {
        Tubelight philipsTubelight = new Tubelight("Philips", "LED", 10.99);
        System.out.println(philipsTubelight);
        System.out.println("Custom hashCode (overridden): " + philipsTubelight.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(philipsTubelight));
    }
}


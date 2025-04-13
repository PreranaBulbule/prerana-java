package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Tubelight;

public class TubelightRunner {
    public static void main(String[] args) {
        Tubelight philipsTubelight = new Tubelight("Philips", "LED", 10.99);
        System.out.println(philipsTubelight);
        System.out.println("Custom hashCode (overridden): " + philipsTubelight.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(philipsTubelight));

        Tubelight t1 = new Tubelight("Philips", "LED", 10.99);
        Tubelight t2 = new Tubelight("Philips", "LED", 10.99);
        boolean same = t1.equals(t2);
        System.out.println("Both Tubelights are same: " + same);

        Tubelight t3 = new Tubelight("Osram", "Fluorescent", 12.99);
        boolean different = t1.equals(t3);
        System.out.println("Both Tubelights are same: " + different);
    }
}

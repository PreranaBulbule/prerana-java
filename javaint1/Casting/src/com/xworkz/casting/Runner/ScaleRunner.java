package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Scale;

public class ScaleRunner {
    public static void main(String[] args) {
        Scale woodenScale = new Scale("Wood", 30.0, 50.00);
        System.out.println(woodenScale);
        System.out.println("Custom hashCode (overridden): " + woodenScale.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(woodenScale));

        Scale s1 = new Scale("Wood", 30.0, 50.00);
        Scale s2 = new Scale("Wood", 30.0, 50.00);
        boolean same = s1.equals(s2);
        System.out.println("Both scales are same: " + same);

        Scale s3 = new Scale("Plastic", 15.0, 20.00);
        Scale s4 = new Scale("Wood", 30.0, 50.00);
        boolean different = s3.equals(s4);
        System.out.println("Both scales are same: " + different);
    }
}

package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Mirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror rectangularMirror = new Mirror("Glass", "Rectangular", 25.99);
        System.out.println(rectangularMirror);
        System.out.println("Custom hashCode (overridden): " + rectangularMirror.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(rectangularMirror));

        Mirror mirror1 = new Mirror("Glass", "Rectangular", 25.99);
        Mirror mirror2 = new Mirror("Glass", "Rectangular", 25.99);
        boolean same = mirror1.equals(mirror2);
        System.out.println("Both mirrors are same: " + same);

        Mirror mirror3 = new Mirror("Plastic", "Circular", 15.00);
        Mirror mirror4 = new Mirror("Glass", "Oval", 30.00);
        boolean different = mirror3.equals(mirror4);
        System.out.println("Both mirrors are same: " + different);
    }
}

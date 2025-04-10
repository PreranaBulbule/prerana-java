package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Mirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror rectangularMirror = new Mirror("Glass", "Rectangular", 25.99);
        System.out.println(rectangularMirror);
        System.out.println("Custom hashCode (overridden): " + rectangularMirror.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(rectangularMirror));
    }
}



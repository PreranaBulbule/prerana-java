package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Zip;

public class ZipRunner {
    public static void main(String[] args) {
        Zip zipper = new Zip("YKK", "Black", 10.99);
        System.out.println(zipper);
        System.out.println("Custom hashCode (overridden): " + zipper.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(zipper));
    }
}


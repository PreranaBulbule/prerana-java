package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Sharpener;

public class SharpenerRunner {
    public static void main(String[] args) {
        Sharpener plasticSharpener = new Sharpener("Faber-Castell", "Blue", 30.00);
        System.out.println(plasticSharpener);
        System.out.println("Custom hashCode (overridden): " + plasticSharpener.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(plasticSharpener));
    }
}


package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Sharpener;

public class SharpenerRunner {
    public static void main(String[] args) {
        Sharpener plasticSharpener = new Sharpener("Faber-Castell", "Blue", 30.00);
        System.out.println(plasticSharpener);
        System.out.println("Custom hashCode (overridden): " + plasticSharpener.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(plasticSharpener));

        Sharpener s1 = new Sharpener("Faber-Castell", "Blue", 30.00);
        Sharpener s2 = new Sharpener("Faber-Castell", "Blue", 30.00);
        boolean same = s1.equals(s2);
        System.out.println("Both sharpeners are same: " + same);

        Sharpener s3 = new Sharpener("Maped", "Green", 40.00);
        Sharpener s4 = new Sharpener("Faber-Castell", "Blue", 30.00);
        boolean different = s3.equals(s4);
        System.out.println("Both sharpeners are same: " + different);
    }
}

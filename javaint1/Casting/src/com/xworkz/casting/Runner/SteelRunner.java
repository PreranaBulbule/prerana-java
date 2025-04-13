package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Steel;

public class SteelRunner {
    public static void main(String[] args) {
        Steel stainlessSteel = new Steel("Grade 304", "Stainless Steel", 5000.00);
        System.out.println(stainlessSteel);
        System.out.println("Custom hashCode (overridden): " + stainlessSteel.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(stainlessSteel));

        Steel s1 = new Steel("Grade 304", "Stainless Steel", 5000.00);
        Steel s2 = new Steel("Grade 304", "Stainless Steel", 5000.00);
        boolean same = s1.equals(s2);
        System.out.println("Both steels are same: " + same);

        Steel s3 = new Steel("Grade 316", "Stainless Steel", 5500.00);
        Steel s4 = new Steel("Grade 304", "Stainless Steel", 5000.00);
        boolean different = s3.equals(s4);
        System.out.println("Both steels are same: " + different);
    }
}

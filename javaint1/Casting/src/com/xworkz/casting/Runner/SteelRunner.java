package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Steel;

public class SteelRunner {
    public static void main(String[] args) {
        Steel stainlessSteel = new Steel("Grade 304", "Stainless Steel", 5000.00);
        System.out.println(stainlessSteel);
        System.out.println("Custom hashCode (overridden): " + stainlessSteel.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(stainlessSteel));
    }
}


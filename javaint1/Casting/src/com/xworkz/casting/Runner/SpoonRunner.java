package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Spoon;

public class SpoonRunner {
    public static void main(String[] args) {
        Spoon silverSpoon = new Spoon("Silver", "Medium", 150.00);
        System.out.println(silverSpoon);
        System.out.println("Custom hashCode (overridden): " + silverSpoon.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(silverSpoon));

        Spoon s1 = new Spoon("Silver", "Medium", 150.00);
        Spoon s2 = new Spoon("Silver", "Medium", 150.00);
        boolean same = s1.equals(s2);
        System.out.println("Both spoons are same: " + same);

        Spoon s3 = new Spoon("Wood", "Large", 120.00);
        Spoon s4 = new Spoon("Silver", "Medium", 150.00);
        boolean different = s3.equals(s4);
        System.out.println("Both spoons are same: " + different);
    }
}

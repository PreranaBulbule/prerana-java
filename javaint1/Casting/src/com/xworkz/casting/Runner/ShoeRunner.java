package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe runningShoe = new Shoe("Nike", "Running", 75.99);
        System.out.println(runningShoe);
        System.out.println("Custom hashCode (overridden): " + runningShoe.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(runningShoe));

        Shoe s1 = new Shoe("Nike", "Running", 75.99);
        Shoe s2 = new Shoe("Nike", "Running", 75.99);
        boolean same = s1.equals(s2);
        System.out.println("Both shoes are same: " + same);

        Shoe s3 = new Shoe("Adidas", "Casual", 69.99);
        Shoe s4 = new Shoe("Nike", "Running", 75.99);
        boolean different = s3.equals(s4);
        System.out.println("Both shoes are same: " + different);
    }
}

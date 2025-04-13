package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel cottonTowel = new Towel("AmazonBasics", "Cotton", 499.99);
        System.out.println(cottonTowel);
        System.out.println("Custom hashCode (overridden): " + cottonTowel.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(cottonTowel));

        Towel t1 = new Towel("AmazonBasics", "Cotton", 499.99);
        Towel t2 = new Towel("AmazonBasics", "Cotton", 499.99);
        boolean same = t1.equals(t2);
        System.out.println("Both towels are same: " + same);

        Towel t3 = new Towel("Raymond", "Polyester", 799.99);
        boolean different = t1.equals(t3);
        System.out.println("Both towels are same: " + different);
    }
}

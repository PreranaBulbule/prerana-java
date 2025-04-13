package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Stone;

public class StoneRunner {
    public static void main(String[] args) {
        Stone graniteStone = new Stone("Granite", "Gray", 12.5);
        System.out.println(graniteStone);
        System.out.println("Custom hashCode (overridden): " + graniteStone.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(graniteStone));

        Stone s1 = new Stone("Granite", "Gray", 12.5);
        Stone s2 = new Stone("Granite", "Gray", 12.5);
        boolean same = s1.equals(s2);
        System.out.println("Both stones are same: " + same);

        Stone s3 = new Stone("Marble", "White", 10.0);
        Stone s4 = new Stone("Granite", "Gray", 12.5);
        boolean different = s3.equals(s4);
        System.out.println("Both stones are same: " + different);
    }
}

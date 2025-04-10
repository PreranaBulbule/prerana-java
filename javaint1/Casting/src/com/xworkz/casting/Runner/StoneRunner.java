package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Stone;

public class StoneRunner {
    public static void main(String[] args) {
        Stone graniteStone = new Stone("Granite", "Gray", 12.5);
        System.out.println(graniteStone);
        System.out.println("Custom hashCode (overridden): " + graniteStone.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(graniteStone));
    }
}


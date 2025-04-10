package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Fish;

public class FishRunner {
    public static void main(String[] args) {
        Fish salmon = new Fish("Salmon", "Medium", 800.00);
        System.out.println(salmon);
        System.out.println("Custom hashCode (overridden): " + salmon.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(salmon));
    }
}


package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Fish;

public class FishRunner {
    public static void main(String[] args) {
        Fish salmon = new Fish("Salmon", "Medium", 800.00);
        System.out.println(salmon);
        System.out.println("Custom hashCode (overridden): " + salmon.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(salmon));

        Fish fish1 = new Fish("Salmon", "Medium", 800.00);
        Fish fish2 = new Fish("Salmon", "Medium", 800.00);
        boolean same = fish1.equals(fish2);
        System.out.println("Both fishes are same: " + same);

        Fish fish3 = new Fish("Tuna", "Large", 1200.00);
        Fish fish4 = new Fish("Salmon", "Small", 600.00);
        boolean different = fish3.equals(fish4);
        System.out.println("Both fishes are same: " + different);
    }
}

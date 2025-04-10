package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Sweet;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet gulabJamun = new Sweet("Gulab Jamun", "Indian Dessert", 150.00);
        System.out.println(gulabJamun);
        System.out.println("Custom hashCode (overridden): " + gulabJamun.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(gulabJamun));
    }
}


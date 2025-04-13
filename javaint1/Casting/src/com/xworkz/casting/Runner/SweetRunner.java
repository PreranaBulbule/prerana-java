package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Sweet;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet gulabJamun = new Sweet("Gulab Jamun", "Indian Dessert", 150.00);
        System.out.println(gulabJamun);
        System.out.println("Custom hashCode (overridden): " + gulabJamun.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(gulabJamun));

        Sweet s1 = new Sweet("Gulab Jamun", "Indian Dessert", 150.00);
        Sweet s2 = new Sweet("Gulab Jamun", "Indian Dessert", 150.00);
        boolean same = s1.equals(s2);
        System.out.println("Both sweets are same: " + same);

        Sweet s3 = new Sweet("Jalebi", "Indian Dessert", 100.00);
        Sweet s4 = new Sweet("Gulab Jamun", "Indian Dessert", 150.00);
        boolean different = s3.equals(s4);
        System.out.println("Both sweets are same: " + different);
    }
}

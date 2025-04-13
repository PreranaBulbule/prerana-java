package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Lipstick;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick maybellineLipstick = new Lipstick("Maybelline", "Red", 350.00);
        System.out.println(maybellineLipstick);
        System.out.println("Custom hashCode (overridden): " + maybellineLipstick.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(maybellineLipstick));

        Lipstick lipstick1 = new Lipstick("Maybelline", "Red", 350.00);
        Lipstick lipstick2 = new Lipstick("Maybelline", "Red", 350.00);
        boolean same = lipstick1.equals(lipstick2);
        System.out.println("Both lipsticks are same: " + same);

        Lipstick lipstick3 = new Lipstick("L'Oreal", "Pink", 400.00);
        Lipstick lipstick4 = new Lipstick("Maybelline", "Red", 350.00);
        boolean different = lipstick3.equals(lipstick4);
        System.out.println("Both lipsticks are same: " + different);
    }
}

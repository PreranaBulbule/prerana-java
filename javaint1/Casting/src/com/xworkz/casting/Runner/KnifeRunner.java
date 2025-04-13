package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Knife;

public class KnifeRunner {
    public static void main(String[] args) {
        Knife victorinoxKnife = new Knife("Victorinox", "Stainless Steel", 2500.00);
        System.out.println(victorinoxKnife);
        System.out.println("Custom hashCode (overridden): " + victorinoxKnife.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(victorinoxKnife));

        Knife knife1 = new Knife("Victorinox", "Stainless Steel", 2500.00);
        Knife knife2 = new Knife("Victorinox", "Stainless Steel", 2500.00);
        boolean same = knife1.equals(knife2);
        System.out.println("Both knives are same: " + same);

        Knife knife3 = new Knife("Gerber", "Carbon Steel", 3000.00);
        Knife knife4 = new Knife("Victorinox", "Stainless Steel", 2500.00);
        boolean different = knife3.equals(knife4);
        System.out.println("Both knives are same: " + different);
    }
}

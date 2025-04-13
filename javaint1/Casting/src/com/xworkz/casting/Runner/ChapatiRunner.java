package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Chapati;

public class ChapatiRunner {
    public static void main(String[] args) {
        Chapati wheatChapati = new Chapati("Wheat", "Medium", 1.50);
        System.out.println(wheatChapati);
        System.out.println("Custom hashCode (overridden): " + wheatChapati.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(wheatChapati));

        Chapati chapati1 = new Chapati();
        chapati1.setFlourType("Wheat");

        Chapati chapati2 = new Chapati();
        chapati2.setFlourType("Wheat");

        boolean same = chapati1.equals(chapati2);
        System.out.println("Both same flour type: " + same);
    }
}



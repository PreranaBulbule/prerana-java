package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Chapati;

public class ChapatiRunner {
    public static void main(String[] args) {
        Chapati wheatChapati = new Chapati("Wheat", "Medium", 1.50);
        System.out.println(wheatChapati);
        System.out.println("Custom hashCode (overridden): " + wheatChapati.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(wheatChapati));
    }
}


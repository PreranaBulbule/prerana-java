package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Paper;

public class PaperRunner {
    public static void main(String[] args) {
        Paper a4Paper = new Paper("A4", "A4 Size", 50.00);
        System.out.println(a4Paper);
        System.out.println("Custom hashCode (overridden): " + a4Paper.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(a4Paper));
    }
}


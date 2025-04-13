package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Paper;

public class PaperRunner {
    public static void main(String[] args) {
        Paper a4Paper = new Paper("A4", "A4 Size", 50.00);
        System.out.println(a4Paper);
        System.out.println("Custom hashCode (overridden): " + a4Paper.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(a4Paper));

        Paper paper1 = new Paper("A4", "A4 Size", 50.00);
        Paper paper2 = new Paper("A4", "A4 Size", 50.00);
        boolean same = paper1.equals(paper2);
        System.out.println("Both papers are same: " + same);

        Paper paper3 = new Paper("A3", "A3 Size", 60.00);
        Paper paper4 = new Paper("A4", "A4 Size", 50.00);
        boolean different = paper3.equals(paper4);
        System.out.println("Both papers are same: " + different);
    }
}

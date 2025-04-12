package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Brush;

public class BrushRunner {
    public static void main(String[] args) {
        Brush colgateBrush = new Brush("Colgate", "Toothbrush", 2.49);
        System.out.println(colgateBrush);
        System.out.println("Custom hashCode (overridden): " + colgateBrush.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(colgateBrush));

        Brush brush1 = new Brush();
        brush1.setBrand("Colgate");

        Brush brush2 = new Brush();
        brush2.setBrand("Colgate");

        boolean same = brush1.equals(brush2);
        System.out.println("Both same brand: " + same);
    }
}




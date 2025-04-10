package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Brush;

public class BrushRunner {
    public static void main(String[] args) {
        Brush colgateBrush = new Brush("Colgate", "Toothbrush", 2.49);
        System.out.println(colgateBrush);
        System.out.println("Custom hashCode (overridden): " + colgateBrush.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(colgateBrush));
    }
}



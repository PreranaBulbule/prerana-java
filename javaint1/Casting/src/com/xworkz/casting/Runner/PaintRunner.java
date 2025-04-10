package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Paint;

public class PaintRunner {
    public static void main(String[] args) {
        Paint asianPaint = new Paint("Asian Paints", "White", 15.99);
        System.out.println(asianPaint);
        System.out.println("Custom hashCode (overridden): " + asianPaint.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(asianPaint));
    }
}



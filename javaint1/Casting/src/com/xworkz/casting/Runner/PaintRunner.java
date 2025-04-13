package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Paint;

public class PaintRunner {
    public static void main(String[] args) {
        Paint asianPaint = new Paint("Asian Paints", "White", 15.99);
        System.out.println(asianPaint);
        System.out.println("Custom hashCode (overridden): " + asianPaint.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(asianPaint));

        Paint paint1 = new Paint("Asian Paints", "White", 15.99);
        Paint paint2 = new Paint("Asian Paints", "White", 15.99);
        boolean same = paint1.equals(paint2);
        System.out.println("Both paints are same: " + same);

        Paint paint3 = new Paint("Dulux", "Red", 20.00);
        Paint paint4 = new Paint("Asian Paints", "White", 15.99);
        boolean different = paint3.equals(paint4);
        System.out.println("Both paints are same: " + different);
    }
}

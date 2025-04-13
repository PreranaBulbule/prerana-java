package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Pencil;

public class PencilRunner {
    public static void main(String[] args) {
        Pencil camlinPencil = new Pencil("Camlin", "HB", 15.00);
        System.out.println(camlinPencil);
        System.out.println("Custom hashCode (overridden): " + camlinPencil.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(camlinPencil));

        Pencil pencil1 = new Pencil("Camlin", "HB", 15.00);
        Pencil pencil2 = new Pencil("Camlin", "HB", 15.00);
        boolean same = pencil1.equals(pencil2);
        System.out.println("Both pencils are same: " + same);

        Pencil pencil3 = new Pencil("Nataraj", "2B", 10.00);
        Pencil pencil4 = new Pencil("Camlin", "HB", 15.00);
        boolean different = pencil3.equals(pencil4);
        System.out.println("Both pencils are same: " + different);
    }
}

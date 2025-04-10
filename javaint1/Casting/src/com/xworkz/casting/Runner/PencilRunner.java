package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Pencil;

public class PencilRunner {
    public static void main(String[] args) {
        Pencil camlinPencil = new Pencil("Camlin", "HB", 15.00);
        System.out.println(camlinPencil);
        System.out.println("Custom hashCode (overridden): " + camlinPencil.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(camlinPencil));
    }
}

package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Uno;

public class UnoRunner {
    public static void main(String[] args) {
        Uno classicUno = new Uno("Classic", "Red", 10.99);
        System.out.println(classicUno);
        System.out.println("Custom hashCode (overridden): " + classicUno.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(classicUno));
    }
}


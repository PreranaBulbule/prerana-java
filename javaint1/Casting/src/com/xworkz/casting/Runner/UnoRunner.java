package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Uno;

public class UnoRunner {
    public static void main(String[] args) {
        Uno classicUno = new Uno("Classic", "Red", 10.99);
        System.out.println(classicUno);
        System.out.println("Custom hashCode (overridden): " + classicUno.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(classicUno));

        Uno u1 = new Uno("Classic", "Red", 10.99);
        Uno u2 = new Uno("Classic", "Red", 10.99);
        boolean same = u1.equals(u2);
        System.out.println("Both Uno games are same: " + same);

        Uno u3 = new Uno("Attack", "Blue", 15.99);
        boolean different = u1.equals(u3);
        System.out.println("Both Uno games are same: " + different);
    }
}

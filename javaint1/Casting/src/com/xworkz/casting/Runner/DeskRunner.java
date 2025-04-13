package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Desk;

public class DeskRunner {
    public static void main(String[] args) {
        Desk officeDesk = new Desk("Wood", "Brown", 2500.00);
        System.out.println(officeDesk);
        System.out.println("Custom hashCode (overridden): " + officeDesk.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(officeDesk));

        Desk d1 = new Desk();
        d1.setMaterial("Wood");

        Desk d2 = new Desk();
        d2.setMaterial("Wood");

        boolean same = d1.equals(d2);
        System.out.println("Both same material: " + same);
    }
}



package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Laddu;

public class LadduRunner {
    public static void main(String[] args) {
        Laddu motichurLaddu = new Laddu("Motichur Laddu", "Indian Sweet", 250.00);
        System.out.println(motichurLaddu);
        System.out.println("Custom hashCode (overridden): " + motichurLaddu.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(motichurLaddu));
    }
}


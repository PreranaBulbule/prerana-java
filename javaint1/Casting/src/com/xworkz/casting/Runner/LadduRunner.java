package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Laddu;

public class LadduRunner {
    public static void main(String[] args) {
        Laddu motichurLaddu = new Laddu("Motichur Laddu", "Indian Sweet", 250.00);
        System.out.println(motichurLaddu);
        System.out.println("Custom hashCode (overridden): " + motichurLaddu.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(motichurLaddu));

        Laddu laddu1 = new Laddu("Motichur Laddu", "Indian Sweet", 250.00);
        Laddu laddu2 = new Laddu("Motichur Laddu", "Indian Sweet", 250.00);
        boolean same = laddu1.equals(laddu2);
        System.out.println("Both laddus are same: " + same);

        Laddu laddu3 = new Laddu("Rava Laddu", "Indian Sweet", 300.00);
        Laddu laddu4 = new Laddu("Motichur Laddu", "Indian Sweet", 250.00);
        boolean different = laddu3.equals(laddu4);
        System.out.println("Both laddus are same: " + different);
    }
}

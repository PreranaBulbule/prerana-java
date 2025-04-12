package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box cardboardBox = new Box("Cardboard", "Medium", 120.00);
        System.out.println(cardboardBox);
        System.out.println("Custom hashCode (overridden): " + cardboardBox.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(cardboardBox));

        Box box1 = new Box();
        box1.setMaterial("Cardboard");

        Box box2 = new Box();
        box2.setMaterial("Cardboard");

        boolean same = box1.equals(box2);
        System.out.println("Both same material: " + same);
    }
}



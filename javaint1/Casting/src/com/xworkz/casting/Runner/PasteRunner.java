package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Paste;

public class PasteRunner {
    public static void main(String[] args) {
        Paste fevicolPaste = new Paste("Fevicol", "Adhesive", 5.99);
        System.out.println(fevicolPaste);
        System.out.println("Custom hashCode (overridden): " + fevicolPaste.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(fevicolPaste));

        Paste paste1 = new Paste("Fevicol", "Adhesive", 5.99);
        Paste paste2 = new Paste("Fevicol", "Adhesive", 5.99);
        boolean same = paste1.equals(paste2);
        System.out.println("Both pastes are same: " + same);

        Paste paste3 = new Paste("Elmers", "Glue", 3.49);
        Paste paste4 = new Paste("Fevicol", "Adhesive", 5.99);
        boolean different = paste3.equals(paste4);
        System.out.println("Both pastes are same: " + different);
    }
}

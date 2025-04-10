package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Paste;

public class PasteRunner {
    public static void main(String[] args) {
        Paste fevicolPaste = new Paste("Fevicol", "Adhesive", 5.99);
        System.out.println(fevicolPaste);
        System.out.println("Custom hashCode (overridden): " + fevicolPaste.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(fevicolPaste));
    }
}



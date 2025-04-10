package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", "iPhone 14", 99999.00);
        System.out.println(iphone);
        System.out.println("Custom hashCode (overridden): " + iphone.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(iphone));
    }
}


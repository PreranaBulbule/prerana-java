package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", "iPhone 14", 99999.00);
        System.out.println(iphone);
        System.out.println("Custom hashCode (overridden): " + iphone.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(iphone));

        Phone phone1 = new Phone("Apple", "iPhone 14", 99999.00);
        Phone phone2 = new Phone("Apple", "iPhone 14", 99999.00);
        boolean same = phone1.equals(phone2);
        System.out.println("Both phones are same: " + same);

        Phone phone3 = new Phone("Samsung", "Galaxy S21", 79999.00);
        Phone phone4 = new Phone("Apple", "iPhone 14", 99999.00);
        boolean different = phone3.equals(phone4);
        System.out.println("Both phones are same: " + different);
    }
}

package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Screen;

public class ScreenRunner {
    public static void main(String[] args) {
        Screen ledScreen = new Screen("LED", 55.0, 25000.00);
        System.out.println(ledScreen);
        System.out.println("Custom hashCode (overridden): " + ledScreen.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(ledScreen));

        Screen s1 = new Screen("LED", 55.0, 25000.00);
        Screen s2 = new Screen("LED", 55.0, 25000.00);
        boolean same = s1.equals(s2);
        System.out.println("Both screens are same: " + same);

        Screen s3 = new Screen("OLED", 65.0, 55000.00);
        Screen s4 = new Screen("LED", 55.0, 25000.00);
        boolean different = s3.equals(s4);
        System.out.println("Both screens are same: " + different);
    }
}

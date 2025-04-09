package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Screen;

public class ScreenRunner {
    public static void main(String[] args) {
        Screen ledScreen = new Screen("LED", 55.0, 25000.00);
        System.out.println(ledScreen);
    }
}

package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator scientificCalculator = new Calculator("Casio", "FX-991EX", 22.50);
        System.out.println(scientificCalculator);
        System.out.println("Custom hashCode (overridden): " + scientificCalculator.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(scientificCalculator));

        Calculator calc1 = new Calculator();
        calc1.setBrand("Casio");

        Calculator calc2 = new Calculator();
        calc2.setBrand("Casio");

        boolean same = calc1.equals(calc2);
        System.out.println("Both same brand: " + same);
    }
}


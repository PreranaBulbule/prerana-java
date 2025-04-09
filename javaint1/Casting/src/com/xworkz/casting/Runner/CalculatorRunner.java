package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator scientificCalculator = new Calculator("Casio", "FX-991EX", 22.50);
        System.out.println(scientificCalculator);
    }
}

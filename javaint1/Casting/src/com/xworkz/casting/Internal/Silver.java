package com.xworkz.casting.Internal;

public class Silver {
    private String purity;
    private double weight;
    private double pricePerGram;

    public Silver(String purity, double weight, double pricePerGram) {
        this.purity = purity;
        this.weight = weight;
        this.pricePerGram = pricePerGram;
    }

    @Override
    public String toString() {
        return "Silver [purity=" + purity + ", weight=" + weight + " grams, pricePerGram=" + pricePerGram + "]";
    }
}

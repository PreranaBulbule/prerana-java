package com.xworkz.casting.Internal;

public class Rummy {
    private String deckType;
    private int numberOfPlayers;
    private double price;

    public Rummy(String deckType, int numberOfPlayers, double price) {
        this.deckType = deckType;
        this.numberOfPlayers = numberOfPlayers;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rummy [deckType=" + deckType + ", numberOfPlayers=" + numberOfPlayers + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("RummyHashCode (from super): " + super.hashCode());
        return 3900;
    }
}

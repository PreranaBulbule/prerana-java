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
        return "Rummy{deckType=" + deckType + ", numberOfPlayers=" + numberOfPlayers + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("RummyHashCode: " + super.hashCode());
        return 9090;
    }

    public void setDeckType(String deckType) {
        this.deckType = deckType;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Rummy) {
                System.out.println("have ref. will compare..");
                Rummy r1 = this;
                Rummy r2 = (Rummy) obj;
                if (r1.deckType.equals(r2.deckType) &&
                        r1.numberOfPlayers == r2.numberOfPlayers &&
                        r1.price == r2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
